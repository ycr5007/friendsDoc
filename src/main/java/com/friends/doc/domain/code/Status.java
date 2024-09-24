package com.friends.doc.domain.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Status {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    private final String value;
}
