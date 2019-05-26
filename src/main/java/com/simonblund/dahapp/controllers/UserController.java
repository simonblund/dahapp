package com.simonblund.dahapp.controllers;


import com.simonblund.dahapp.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello this is dahapp";
    }

    @PostMapping("/api/v1/user/new")
    public User newUser(@RequestBody User user){
        return user;

    }

}
