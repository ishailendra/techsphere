package dev.techsphere.mapping.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.techsphere.mapping.onetomany.entity.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {

}
