package org.core.spring_core;

import org.core.spring_core.discount.FixDiscountPolicy;
import org.core.spring_core.member.MemberMemoryRepository;
import org.core.spring_core.member.MemberService;
import org.core.spring_core.member.MemberServiceImpl;
import org.core.spring_core.order.OrderService;
import org.core.spring_core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(new MemberMemoryRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemberMemoryRepository(), new FixDiscountPolicy());
    }





}
