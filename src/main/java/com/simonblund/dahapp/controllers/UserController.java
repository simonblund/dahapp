package com.simonblund.dahapp.controllers;


import com.simonblund.dahapp.data.UserMapper;
import com.simonblund.dahapp.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello this is dahapp";
    }

    @GetMapping("/api/v1/users/all")
    public List<User> getAll(){
        return userMapper.findAll();
    }


    @GetMapping("/api/v1/users/{id}")
    public User getWithId(Integer id){
        return userMapper.getUserWithId(id);
    }

    @PostMapping("/api/v1/user/new")
    public User insert(@RequestBody User user){
        return user;

    }



}
