package kr.pe.withme.portfolio.domain.repository

import kr.pe.withme.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository:JpaRepository<HttpInterface, Long> {
}