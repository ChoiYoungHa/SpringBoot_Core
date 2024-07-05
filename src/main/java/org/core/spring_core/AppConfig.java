package org.core.spring_core;

import org.core.spring_core.discount.DiscountPolicy;
import org.core.spring_core.discount.FixDiscountPolicy;
import org.core.spring_core.discount.RateDiscountPolicy;
import org.core.spring_core.member.MemberMemoryRepository;
import org.core.spring_core.member.MemberRepository;
import org.core.spring_core.member.MemberService;
import org.core.spring_core.member.MemberServiceImpl;
import org.core.spring_core.order.OrderService;
import org.core.spring_core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemberMemoryRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }





}
