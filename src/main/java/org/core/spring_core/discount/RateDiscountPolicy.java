package org.core.spring_core.discount;

import org.core.spring_core.Annotaion.MainDiscountPolicy;
import org.core.spring_core.member.Grade;
import org.core.spring_core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        // 10% 할인
        if (member.getGrade() == Grade.VIP) return price * discountPercent / 100;
        else return 0;
    }
}
