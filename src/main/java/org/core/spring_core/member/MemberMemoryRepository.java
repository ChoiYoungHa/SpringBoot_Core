package org.core.spring_core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class MemberMemoryRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getMember_id(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
