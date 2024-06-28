package org.core.spring_core.discount;

import org.core.spring_core.member.Grade;
import org.core.spring_core.member.Member;
import org.core.spring_core.member.MemberService;
import org.core.spring_core.member.MemberServiceImpl;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) return discountFixAmount;
        else return 0;
    }
}
