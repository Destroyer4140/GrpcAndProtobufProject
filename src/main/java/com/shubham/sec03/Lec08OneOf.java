package com.shubham.sec03;

import com.shubham.models.sec03.Credentials;
import com.shubham.models.sec03.Email;
import com.shubham.models.sec03.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec08OneOf {

    public static final Logger log = LoggerFactory.getLogger(Lec08OneOf.class);

    public static void main(String[] args) {

        var email = Email.newBuilder()
                .setAddress("a@b.com")
                .setPassword("password")
                .build();
        var phone = Phone.newBuilder()
                .setNumber(1234567890)
                .setCode(123)
                .build();
        var credentials = Credentials.newBuilder()
//                .setEmail(email)
                .setPhone(phone)
                .build();
        login(credentials);

    }

    private static void login(Credentials credentials) {
        switch (credentials.getLoginTypeCase()) {
            case EMAIL -> log.info("Email: {}", credentials.getEmail());
            case PHONE -> log.info("Phone: {}", credentials.getPhone());
            default -> log.info("Unknown login type");
        }
    }
}
