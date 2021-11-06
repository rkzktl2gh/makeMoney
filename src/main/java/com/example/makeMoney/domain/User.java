package com.example.makeMoney.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {

    @Id @GeneratedValue
    private Long user_id;
    private String user_pw;
    private String user_name;
    private String user_email;
    private int user_money;

    private String user_join;

/*
    @OneToOne
    private Wallet wallet;
*/



}
