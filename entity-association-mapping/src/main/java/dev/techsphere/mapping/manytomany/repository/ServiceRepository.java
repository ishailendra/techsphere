package dev.techsphere.mapping.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.techsphere.mapping.manytomany.entity.ServiceEntity;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Integer>{

	ServiceEntity findByServiceName(String string);

}
