package org.core.spring_core.singtone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        // threadA 10000
        int userA = statefulService1.order("userA", 10000);
        int userB = statefulService2.order("userB", 20000);

//        int price = statefulService1.getPrice();
        System.out.println("price:" + userA);
        org.assertj.core.api.Assertions.assertThat(userA).isEqualTo(10000);

    }


    static class TestConfig{

        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }

}