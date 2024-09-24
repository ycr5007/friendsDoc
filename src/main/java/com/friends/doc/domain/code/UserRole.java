package com.friends.doc.domain.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {

    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN"),
    MANAGER("ROLE_MANAGER");

    private final String value;
}
