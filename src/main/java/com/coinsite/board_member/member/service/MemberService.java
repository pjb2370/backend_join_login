package com.coinsite.board_member.member.service;

import com.coinsite.board_member.member.deo.MemberRepository;
import com.coinsite.board_member.member.domain.Member;
import com.coinsite.board_member.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    public void join(Member member) {
        memberRepository.save(member);
    }

    public MemberDto login(Member member) throws Exception {
        Optional<Member> opMember = memberRepository.findByUserid(member.getUserid());
        if (opMember.isPresent()) {
            Member loginedMember = opMember.get();
            System.out.println("db member password: " + loginedMember.getPassword());
            System.out.println("전송받은 member password: " + member.getPassword());
            if (loginedMember.getPassword().equals(member.getPassword())) {
                MemberDto memberDto = new MemberDto();
                memberDto.setId(loginedMember.getId());
                memberDto.setUserid(loginedMember.getUserid());
                memberDto.setName(loginedMember.getName());

                return memberDto;
            }
            throw new Exception();
        }
        throw new Exception();
    }
}
