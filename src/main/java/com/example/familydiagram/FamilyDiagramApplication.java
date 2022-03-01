package com.example.familydiagram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class FamilyDiagramApplication {


    public static void main(String[] args) {
        SpringApplication.run(FamilyDiagramApplication.class, args);
    }

}
