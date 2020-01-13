package com.project.agriculture.repository;

import com.project.agriculture.entity.MemberEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<MemberEntity, Long> { 
    MemberEntity findByUsername(String username);
}  