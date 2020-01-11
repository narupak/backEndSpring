// package com.project.agriculture.controller;

// import java.util.HashMap;
// import java.util.Map;

// import com.project.agriculture.model.RegisterModel;
// import com.project.agriculture.services.RegisterService;

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
//     private RegisterService RegisterService;

//     @Autowired(required = false)
//     MainController(RegisterService RegisterService){
//         this.RegisterService = RegisterService;
//     }
    
//     // @PostMapping("/register")
//     // public ResponseEntity<Map<String , Object>> main(@RequestBody RegisterModel Register){
//     //     RegisterModel RegisterModel = RegisterService.saveRegister(Register);
//     //     Map<String , Object> mapRegis = new HashMap<>();
//     //     mapRegis.put("result", RegisterModel); 
//     //     return new ResponseEntity<>(mapRegis , HttpStatus.OK);
//     // }
// }  