package org.core.spring_core.order;

import org.assertj.core.api.Assertions;
import org.core.spring_core.discount.DiscountPolicy;
import org.core.spring_core.discount.FixDiscountPolicy;
import org.core.spring_core.member.Grade;
import org.core.spring_core.member.Member;
import org.core.spring_core.member.MemberService;
import org.core.spring_core.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void orderTest(){
        //given
        Long memberId = 1L;
        Member member = new Member(memberId, "MemberA", Grade.VIP);
        memberService.join(member);

        //when
        Order order = orderService.createOrder(memberId, "ItemA", 10000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
        Assertions.assertThat(order.calculatePrice()).isEqualTo(9000);

    }

}