package dev.techsphere.mapping.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.techsphere.mapping.onetomany.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
