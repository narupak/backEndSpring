package com.project.agriculture.controller;

import com.project.agriculture.config.JwtTokenUtil;
import com.project.agriculture.model.JwtRequest;
import com.project.agriculture.model.JwtResponse;
import com.project.agriculture.model.JwtToken;
import com.project.agriculture.model.MemberDto;
import com.project.agriculture.services.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class JwtAuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/authenticate" , method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
        authenticate(authenticationRequest.getUsername() , authenticationRequest.getPassword());
        final UserDetails userDetails = memberService.loadUserByUsername(authenticationRequest.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody MemberDto memberDto) throws Exception {
        return ResponseEntity.ok(memberService.saveUser(memberDto));
    }

    @RequestMapping(value = "/getRoleWithToken" , method = RequestMethod.POST)
    public ResponseEntity<?> getRoleWithToken(@RequestBody JwtToken jwtToken) throws Exception {
        final String username = jwtTokenUtil.getUsernameFromToken(jwtToken.getToken());
        MemberDto member = memberService.getUserByUsername(username);
        return ResponseEntity.ok(member);
    } 

    private void authenticate(String username , String password) throws Exception {
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username , password));
        }catch(DisabledException e){
            throw new Exception("USER_DISABLED" , e);
        }catch(BadCredentialsException e){
            throw new Exception("INVALID_CREDENTIALS" , e);
        }
    }
}