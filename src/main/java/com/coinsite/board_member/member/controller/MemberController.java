package com.coinsite.board_member.member.controller;

import com.coinsite.board_member.member.domain.Member;
import com.coinsite.board_member.member.dto.MemberDto;
import com.coinsite.board_member.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/join")
    public String join(@RequestBody Member member) {
        System.out.println("username:" + member.getUserid());

        memberService.join(member);

        return "user";
    }

    @PostMapping("/login")
    public MemberDto login(@RequestBody Member member) throws Exception {
        MemberDto loginedMember = memberService.login(member);
        return loginedMember;
    }
}
