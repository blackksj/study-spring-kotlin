package kr.pe.withme.portfolio.domain.repository

import kr.pe.withme.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository:JpaRepository<ProjectSkill, Long> {
}