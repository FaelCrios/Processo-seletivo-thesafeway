package com.example.demo.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserResources {
    
@Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){        
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    } 

}
