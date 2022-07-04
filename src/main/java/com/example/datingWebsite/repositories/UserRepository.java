package com.example.datingWebsite.repositories;

import com.example.datingWebsite.dto.UserDto;
import com.example.datingWebsite.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    @Query("SELECT new com.example.datingWebsite.dto(u.id, u.username, u.firstName, u.lastName, u.age, u.gender, u.interestIn) " +
            "FROM UserEntity u WHERE id= :id")
    UserDto getUser(@Param("id") long id);

    @Query("SELECT new com.example.datingWebsite.dto(u.id, u.username, u.firstName, u.lastName, u.age, u.gender, u.interestIn) " +
            "FROM UserEntity u")
    List<UserDto> getUsers();
}
