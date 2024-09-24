package com.friends.doc.domain;

import jakarta.persistence.OneToOne;

public class UserAgreement {

    @OneToOne
    private User user;

    private String colPersonalInformationYn; // 개인정보수집동의
}
