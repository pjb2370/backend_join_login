package com.coinsite.board_member.member.deo;

import com.coinsite.board_member.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUserid (String userid);
}
