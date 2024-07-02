package org.core.spring_core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memoryRepository;

    public MemberServiceImpl(MemberMemoryRepository memoryRepository) {
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
}
