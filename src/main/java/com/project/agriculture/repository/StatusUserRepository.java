package com.project.agriculture.repository;

import com.project.agriculture.entity.GenderEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusUserRepository extends CrudRepository<GenderEntity, Long> { 
}  