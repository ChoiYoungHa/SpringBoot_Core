package org.core.spring_core;

import org.core.spring_core.member.Grade;
import org.core.spring_core.member.Member;
import org.core.spring_core.member.MemberService;
import org.core.spring_core.member.MemberServiceImpl;
import org.core.spring_core.order.Order;
import org.core.spring_core.order.OrderService;
import org.core.spring_core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig app = new AppConfig();
        MemberService memberService = app.memberService();
        OrderService orderService = app.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "MemberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "ItemA", 10000);

        System.out.println("order = " + order);
        System.out.println(order.getDiscountPrice());
        System.out.println(order.calculatePrice());

    }
}
