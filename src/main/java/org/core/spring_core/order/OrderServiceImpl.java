package org.core.spring_core.order;

import org.core.spring_core.discount.DiscountPolicy;
import org.core.spring_core.discount.FixDiscountPolicy;
import org.core.spring_core.member.Member;
import org.core.spring_core.member.MemberService;
import org.core.spring_core.member.MemberServiceImpl;

public class OrderServiceImpl implements OrderService {

    private final MemberService memberService = new MemberServiceImpl();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberService.findMember(memberId);
        int discount = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discount);
    }

}
