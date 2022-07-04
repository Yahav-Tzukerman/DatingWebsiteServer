package com.example.datingWebsite.dto;

import com.example.datingWebsite.entities.UserEntity;
import com.example.datingWebsite.enums.Gender;

import javax.persistence.*;

public class UserDto {
    private long id;
    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private Gender interestIn;

    public UserDto() {
    }

    public UserDto(UserEntity userEntity) {
        this.id = userEntity.getId();
        this.username = userEntity.getUsername();
        this.firstName = userEntity.getFirstName();
        this.lastName = userEntity.getLastName();
        this.age = userEntity.getAge();
        this.gender = userEntity.getGender();
        this.interestIn = userEntity.getInterestIn();
    }

    public UserDto(long id, String username, String firstName, String lastName, int age, Gender gender, Gender interestIn) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.interestIn = interestIn;
    }

    public UserDto(String username, String firstName, String lastName, int age, Gender gender, Gender interestIn) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.interestIn = interestIn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getInterestIn() {
        return interestIn;
    }

    public void setInterestIn(Gender interestIn) {
        this.interestIn = interestIn;
    }
}
