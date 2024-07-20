package org.core.spring_core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memoryRepository;

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
