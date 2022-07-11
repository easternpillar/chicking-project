package com.chicking.chicking.repository;

import com.chicking.chicking.domain.Brand
import org.springframework.data.jpa.repository.JpaRepository

interface BrandRepository : JpaRepository<Brand, Long> {
}