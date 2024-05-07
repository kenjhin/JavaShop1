package com.kenjhin.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenjhin.shop.entitiy.Testitem;

public interface TestitemRepository extends JpaRepository<Testitem, Long> {
    // 필요한 경우 커스텀 메서드 추가
}

