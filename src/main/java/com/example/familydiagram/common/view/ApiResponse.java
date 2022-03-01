package com.example.familydiagram.common.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApiResponse<T> {

    private int code;
    private String message;
    private T data;

    public static <T> ApiResponse<T> OK(T data){
        return new ApiResponse<>(200, "성공", data);
    }
}
