package org.core.spring_core.scan;

import org.assertj.core.api.Assertions;
import org.core.spring_core.AppConfig;
import org.core.spring_core.AutoAppConfig;
import org.core.spring_core.member.MemberService;
import org.core.spring_core.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {

    // 자동 컴포넌트 스캔 테스트
    @Test
    void basicScan(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        System.out.println("memberService = " + memberService);

        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);

    }
}
