package com.kenjhin.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kenjhin.shop.entitiy.Testitem;
import com.kenjhin.shop.repository.TestitemRepository;

import java.util.List;

@Service
public class TestitemService {
    @Autowired
    private TestitemRepository testitemRepository;

    public List<Testitem> findAllTestitems() {
        return testitemRepository.findAll();
    }

    // 기존 코드 생략
}