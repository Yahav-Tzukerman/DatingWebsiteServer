package com.example.datingWebsite.controllers;

import com.example.datingWebsite.dto.UserDto;
import com.example.datingWebsite.logics.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserLogic userLogic;

    @Autowired
    public UserController(UserLogic userLogic) {
        this.userLogic = userLogic;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") long id){
        userLogic.deleteUser(id);
    }

    @GetMapping
    public List<UserDto> getUsers(){
        return userLogic.getUsers();
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable("id") long id){
        return userLogic.getUser(id);
    }
}
