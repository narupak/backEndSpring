package com.project.agriculture.main;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController  
public class MainController {  
    @GetMapping("/main")  
    public String main(){
        return "main";
    }
}  