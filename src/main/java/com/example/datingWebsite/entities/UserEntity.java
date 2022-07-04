package com.example.datingWebsite.entities;

import com.example.datingWebsite.dto.UserDto;
import com.example.datingWebsite.enums.Gender;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "age", nullable = false)
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "interest", nullable = false)
    private Gender interestIn;

    public UserEntity() {
    }

    public UserEntity(UserDto userDto) {
        this.id = userDto.getId();
        this.username = userDto.getUsername();
        this.firstName = userDto.getFirstName();
        this.lastName = userDto.getLastName();
        this.age = userDto.getAge();
        this.gender = userDto.getGender();
        this.interestIn = userDto.getInterestIn();
    }

    public UserEntity(long id, String username, String firstName, String lastName, int age, Gender gender, Gender interestIn) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.interestIn = interestIn;
    }

    public UserEntity(String username, String firstName, String lastName, int age, Gender gender, Gender interestIn) {
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
