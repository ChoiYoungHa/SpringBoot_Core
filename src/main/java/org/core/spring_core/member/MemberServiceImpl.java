package org.core.spring_core.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memoryRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memoryRepository) {
        this.memoryRepository = memoryRepository;
    }

    @Override
    public void join(Member member) {
        memoryRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memoryRepository.findById(memberId);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository(){
        return memoryRepository;
    }
}
