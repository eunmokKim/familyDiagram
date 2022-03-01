package com.example.familydiagram.biz.user.dto.view;

import lombok.Builder;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Builder
public class UserView {

    private Long id;
    private String name;
    private Long regId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime regDate;
}
