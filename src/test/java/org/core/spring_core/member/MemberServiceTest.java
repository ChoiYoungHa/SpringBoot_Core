package org.core.spring_core.member;

import org.assertj.core.api.Assertions;
import org.core.spring_core.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    @Test
    void join(){

        //given
        Member member = new Member(1L,"MemberA",Grade.VIP);
        memberService.join(member);

        //when
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
