package org.core.spring_core.discount;

import org.assertj.core.api.Assertions;
import org.core.spring_core.member.Grade;
import org.core.spring_core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10%할인이 적용되어야 한다.")
    void vip_o(){
        //given
        int price = 10000000;
        Member member = new Member(1L, "MemberA", Grade.VIP);

        //when
        int discount = rateDiscountPolicy.discount(member, price);

        //then
        assertThat(discount).isEqualTo(1000000);
    }

    @Test
    @DisplayName("VIP는 10%할인이 적용되지 않아야한다.")
    void vip_x(){
        //given
        int price = 10000000;
        Member member = new Member(1L, "MemberA", Grade.BASIC);

        //when
        int discount = rateDiscountPolicy.discount(member, price);

        //then
        assertThat(discount).isEqualTo(0);
    }
}