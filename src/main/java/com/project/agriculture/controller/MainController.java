// package com.project.agriculture.controller;

// import java.util.HashMap;
// import java.util.Map;

// import com.project.agriculture.model.MemberDto;
// import com.project.agriculture.services.MemberService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// @CrossOrigin(origins = "*")
// @RestController
// public class MainController {

//     @Autowired
//     private MemberService memberService;
    
//     @PostMapping("/register")
//     public ResponseEntity<Map<String , Object>> main(@RequestBody MemberDto memberDto){
//         MemberDto member = memberService.saveUser(memberDto);
//         Map<String , Object> mapRegis = new HashMap<>();
//         mapRegis.put("result", member); 
//         return new ResponseEntity<>(mapRegis , HttpStatus.OK);
//     }
// }  