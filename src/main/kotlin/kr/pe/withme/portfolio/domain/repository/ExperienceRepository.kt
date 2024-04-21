package kr.pe.withme.portfolio.domain.repository

import kr.pe.withme.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository:JpaRepository<Experience, Long> {
}