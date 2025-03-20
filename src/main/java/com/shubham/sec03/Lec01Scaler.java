package com.shubham.sec03;

import com.shubham.models.sec03.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec01Scaler {

    private static final Logger log = LoggerFactory.getLogger(Lec01Scaler.class);

    public static void main(String[] args) {

        Person person = Person.newBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(42)
                .setEmail("a@b.com")
                .setEmployed(true)
//                .setSalary(100.0)
                .setBankAccountNumber(123456789L)
                .setBalance(-100)
                .build();
        log.info("{}", person);
    }
}
