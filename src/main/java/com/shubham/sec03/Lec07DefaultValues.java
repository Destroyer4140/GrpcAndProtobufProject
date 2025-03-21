package com.shubham.sec03;

import com.shubham.models.sec03.School;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec07DefaultValues {

    public static final Logger log = LoggerFactory.getLogger(Lec07DefaultValues.class);


    public static void main(String[] args) {

        var school = School.newBuilder()
//                .setId(1)
//                .setName("Acme School")
                .build();

        log.info("{}", school.getId());
        log.info("{}", school.getName());
        log.info("{}", school.getAddress());
    }
}
