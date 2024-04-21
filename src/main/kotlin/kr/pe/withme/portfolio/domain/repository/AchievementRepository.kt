package kr.pe.withme.portfolio.domain.repository

import kr.pe.withme.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository:JpaRepository<Achievement, Long> {
}