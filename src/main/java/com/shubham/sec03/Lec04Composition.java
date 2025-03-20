package com.shubham.sec03;

import com.shubham.models.sec03.Address;
import com.shubham.models.sec03.School;
import com.shubham.models.sec03.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec04Composition {

    private static final Logger log = LoggerFactory.getLogger(Lec04Composition.class);

    public static void main(String[] args) {

        // Create Student
        var address = Address.newBuilder()
                .setStreet("123 Main St")
                .setCity("Anytown")
                .setState("CA")
                .build();

        var student = Student.newBuilder()
                .setName("John Doe")
                .setAddress(address)
                .build();
        //Create School
        var school = School.newBuilder()
                .setId(1)
                .setName("Acme School")
                .setAddress(address)
                .build();

        log.info("{}", student);
        log.info("{}", school);

    }
}
