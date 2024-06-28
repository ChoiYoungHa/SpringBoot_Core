package org.core.spring_core.discount;

import org.core.spring_core.member.Member;

public interface DiscountPolicy {

    /**@param member
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
