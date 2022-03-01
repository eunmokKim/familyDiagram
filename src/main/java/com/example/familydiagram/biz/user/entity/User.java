package com.example.familydiagram.biz.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "reg_id")
    private Long regId;
    @Column(name = "reg_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime regDate;
}
