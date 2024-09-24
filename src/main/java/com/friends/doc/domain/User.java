package com.friends.doc.domain;

import com.friends.doc.domain.code.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    private String userName;

    private String email;

    private String password;

    private String mobile;

    private LocalDate regDate;

    private LocalDate changedPasswordDate;

    private LocalDateTime lastLoginTime;

    private String imgFileMapping;

    private LocalDate validDate; // ACTIVE : 99991231 - default

    private Status status;
}
