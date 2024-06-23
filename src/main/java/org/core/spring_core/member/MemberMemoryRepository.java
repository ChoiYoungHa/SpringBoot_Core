package org.core.spring_core.member;

import java.util.HashMap;
import java.util.Map;

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
