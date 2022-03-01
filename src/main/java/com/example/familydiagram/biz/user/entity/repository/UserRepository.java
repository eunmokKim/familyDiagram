package com.example.familydiagram.biz.user.entity.repository;

import com.example.familydiagram.biz.user.entity.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User, Long> {

    List<User> findAll();
    User findById(Long id);
    void save(User user);
}
