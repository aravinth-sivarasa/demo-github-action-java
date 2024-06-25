package com.example.demo.sample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {
    
    @GetMapping(value = {"/","hello"})
    public ResponseEntity<String>getMethodName() {
        return ResponseEntity.ok().body("Success");
    }
    
}
