package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignRequest {

    private Long id;

    private String email;

    private String password;

    private String nickname;

    private String myself;

    private String hashtag;

}