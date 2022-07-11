package com.chicking.chicking.repository;

import com.chicking.chicking.domain.Store
import org.springframework.data.jpa.repository.JpaRepository

interface StoreRepository : JpaRepository<Store, Long> {
}