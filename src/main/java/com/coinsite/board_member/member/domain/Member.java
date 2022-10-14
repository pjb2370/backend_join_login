package com.coinsite.board_member.member.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String userid;

    @Column(unique = true)
    private String name;

    private String password;
    private String gender;
}
