package dev.techsphere.mapping.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.techsphere.mapping.manytomany.entity.MerchantEntity;

public interface MerchantRepository  extends JpaRepository<MerchantEntity, Integer> {

}
