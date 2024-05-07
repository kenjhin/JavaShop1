package com.kenjhin.shop.repository;

import com.kenjhin.shop.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
