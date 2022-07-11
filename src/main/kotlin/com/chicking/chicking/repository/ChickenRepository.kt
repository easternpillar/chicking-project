package com.chicking.chicking.repository;

import com.chicking.chicking.domain.Chicken
import org.springframework.data.jpa.repository.JpaRepository

interface ChickenRepository : JpaRepository<Chicken, Long> {
}