package dev.techsphere.mapping.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.techsphere.mapping.onetoone.entity.PersonEntity;

public interface PersonEntityRepository extends JpaRepository<PersonEntity, Integer>{

}
