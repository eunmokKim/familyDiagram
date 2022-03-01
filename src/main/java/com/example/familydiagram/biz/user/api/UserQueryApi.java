package com.example.familydiagram.biz.user.api;

import com.example.familydiagram.biz.user.dto.view.UserView;
import com.example.familydiagram.biz.user.service.UserQueryService;
import com.example.familydiagram.common.view.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserQueryApi {
    private UserQueryService userQueryService;

    public UserQueryApi(UserQueryService userQueryService) {
        this.userQueryService = userQueryService;
    }

    @RequestMapping(value = "list")
    public ApiResponse<List<UserView>> getUserList(){
        return ApiResponse.OK(userQueryService.getUserList());
    }
}
