package com.project.agriculture.services.impl;

import java.util.ArrayList;

import com.project.agriculture.entity.MemberEntity;
import com.project.agriculture.model.MemberDto;
import com.project.agriculture.repository.MemberRepository;
import com.project.agriculture.services.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService,UserDetailsService {

    @Autowired 
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;
    
    @Override
    public MemberDto saveUser(MemberDto memberDto) {

        MemberEntity member = mapModeltoEntity(memberDto);
    try{
        memberRepository.save(member);
    }catch(Exception e){
        System.out.println("exception :"+ e);
    }
        return mapEntitytoModel(member);
    }

    public MemberEntity mapModeltoEntity(MemberDto memberDto){
        MemberEntity member = new MemberEntity();
        member.setUsername(memberDto.getUsername());
        member.setPassword(bcryptEncoder.encode(memberDto.getPassword()));
        member.setEmail(memberDto.getEmail());
        member.setTel(memberDto.getTel());
        member.setFirstname(memberDto.getFirstname());
        member.setLastname(memberDto.getLastname());
        member.setGenderId(memberDto.getGenderId());
        member.setRoleId(memberDto.getRoleId());
        return member;
    }

    public MemberDto mapEntitytoModel(MemberEntity member){
        MemberDto memberDto = new MemberDto();
        memberDto.setUsername(member.getUsername());
        memberDto.setPassword(member.getPassword());
        memberDto.setEmail(member.getEmail());
        memberDto.setTel(member.getTel());
        memberDto.setFirstname(member.getFirstname());
        memberDto.setLastname(member.getLastname());
        memberDto.setGenderId(member.getGenderId());
        memberDto.setRoleId(member.getRoleId());
        return memberDto;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        // TODO Auto-generated method stub
        MemberEntity user = memberRepository.findByUsername(username);
        if(user != null){
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
            new ArrayList<>());
        }else{
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

    @Override
    public MemberDto getUserByUsername(String username) {
        MemberEntity member = memberRepository.findByUsername(username);
        return mapEntitytoModel(member);
    }
}