package com.kenjhin.shop.controller;

import com.kenjhin.shop.entitiy.Member;
import com.kenjhin.shop.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/register")
    public ResponseEntity<Member> register(@RequestBody Member member) {
        Member savedMember = memberRepository.save(member);
        return new ResponseEntity<>(savedMember, HttpStatus.CREATED);
    }
}