package dev.techsphere.mapping.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.techsphere.mapping.onetoone.entity.PassportEntity;

public interface PassportRepository extends JpaRepository<PassportEntity, Integer> {

	PassportEntity findByPassportNumber(String passportNumber);
}
