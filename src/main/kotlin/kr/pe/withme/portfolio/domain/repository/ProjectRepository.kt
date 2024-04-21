package kr.pe.withme.portfolio.domain.repository

import kr.pe.withme.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository:JpaRepository<Project, Long> {
}