package org.core.spring_core.scan;

import org.assertj.core.api.Assertions;
import org.core.spring_core.AppConfig;
import org.core.spring_core.AutoAppConfig;
import org.core.spring_core.member.MemberService;
import org.core.spring_core.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {

    @Test
    void basicScan(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        System.out.println("memberService = " + memberService);

        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);


    }
}
