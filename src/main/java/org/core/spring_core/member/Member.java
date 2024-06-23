package org.core.spring_core.member;

public class Member {
    private Long member_id;
    private String name;
    private Grade grade;

    public Member(Long member_id, String name, Grade grade) {
        this.member_id = member_id;
        this.name = name;
        this.grade = grade;
    }

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }


}
