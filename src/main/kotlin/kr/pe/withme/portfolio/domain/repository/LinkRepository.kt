package kr.pe.withme.portfolio.domain.repository

import kr.pe.withme.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository:JpaRepository<Link, Long> {
}