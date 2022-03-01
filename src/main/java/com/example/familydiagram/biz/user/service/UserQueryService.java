package com.example.familydiagram.biz.user.service;

import com.example.familydiagram.biz.user.dto.view.UserView;
import com.example.familydiagram.biz.user.entity.User;
import com.example.familydiagram.biz.user.entity.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class UserQueryService {

    private UserRepository userRepository;

    public UserQueryService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserView> getUserList(){
        return this.convert(userRepository.findAll());
    }

    //TODO 공통을 만들어 한번에 변환하는 방법이 없을까?
    private List<UserView> convert(List<User> user){
        return user.stream()
                .map(this::convertView)
                .collect(Collectors.toList());
    }

    private UserView convertView(User user){
        return UserView.builder()
                .id(user.getId())
                .name(user.getName())
                .regId(user.getRegId())
                .regDate(user.getRegDate())
                .build();
    }
}
