package com.example.familydiagram.biz.user.service;

import com.example.familydiagram.biz.user.entity.User;
import com.example.familydiagram.biz.user.entity.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserQueryServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1(){
        User user = User.builder().name("테스트1").regId(1L).regDate(LocalDateTime.now()).build();
        User user2 = User.builder().name("테스트2").regId(1L).regDate(LocalDateTime.now()).build();
        User user3 = User.builder().name("테스트3").regId(1L).regDate(LocalDateTime.now()).build();

        userRepository.save(user);
        userRepository.save(user2);
        userRepository.save(user3);


        List<User> userList = userRepository.findAll();
        assertEquals(userList.size(), 3);

    }
}