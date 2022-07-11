package com.chicking.chicking.repository;

import com.chicking.chicking.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
}