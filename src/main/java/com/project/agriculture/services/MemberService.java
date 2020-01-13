package com.project.agriculture.services;

import com.project.agriculture.model.MemberDto;

import org.springframework.security.core.userdetails.UserDetails;


public interface MemberService {
    MemberDto saveUser(MemberDto user);
    UserDetails loadUserByUsername(String username);
} 