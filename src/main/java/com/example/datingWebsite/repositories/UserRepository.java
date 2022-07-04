package com.example.datingWebsite.repositories;

import com.example.datingWebsite.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
