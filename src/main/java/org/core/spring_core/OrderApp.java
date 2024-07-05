package org.core.spring_core;

import org.core.spring_core.member.Grade;
import org.core.spring_core.member.Member;
import org.core.spring_core.member.MemberService;
import org.core.spring_core.member.MemberServiceImpl;
import org.core.spring_core.order.Order;
import org.core.spring_core.order.OrderService;
import org.core.spring_core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "MemberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "ItemA", 20000);

        System.out.println("order = " + order);
        System.out.println(order.getDiscountPrice());
        System.out.println(order.calculatePrice());
    }
}
