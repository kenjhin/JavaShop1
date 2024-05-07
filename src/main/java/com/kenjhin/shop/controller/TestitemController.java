package com.kenjhin.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kenjhin.shop.entitiy.Testitem;
import com.kenjhin.shop.service.TestitemService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // 리액트 애플리케이션 도메인을 허용하도록 설정
public class TestitemController {
    @Autowired
    private TestitemService testitemService;

    @GetMapping("/home")
    public List<Testitem> getAllTestitems() {
        return testitemService.findAllTestitems();
    }

    // 기존 코드 생략
}