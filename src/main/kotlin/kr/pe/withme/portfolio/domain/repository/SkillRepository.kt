package kr.pe.withme.portfolio.domain.repository

import kr.pe.withme.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository:JpaRepository<Skill, Long> {
}