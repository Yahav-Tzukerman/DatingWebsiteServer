package com.example.datingWebsite.logics;

import com.example.datingWebsite.dto.UserDto;
import com.example.datingWebsite.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserLogic {

    private final UserRepository userRepository;

    @Autowired
    public UserLogic(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }

    public UserDto getUser(long id){
        return userRepository.getUser(id);
    }

    public List<UserDto> getUsers(){
        return userRepository.getUsers();
    }

}
