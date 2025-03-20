package com.shubham.sec02;

import com.shubham.models.sec02.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleProtoDemo2 {

    private static final Logger log = LoggerFactory.getLogger(SimpleProtoDemo2.class);

    public static void main(String[] args) {
        // create person
        var person1 = createPerson();

        // create person
        var person2 = createPerson();

        // compare using equals
        log.info("Equals: {}", person1.equals(person2));

        // compare using ==
        log.info("==: {}", person1 == person2);

        // create diff object using different value since object is not mutable
        var person3 = person1.toBuilder().setName("mike").build();

        // compare using equals
        log.info("Equals: {}", person1.equals(person3));

        // compare using ==
        log.info("==: {}", person1 == person3);

        //null?
        var person4 = person1.toBuilder().clearName().build();

        // print person
        log.info("{}", person4);
    }

    private static Person createPerson() {
        var person = Person.newBuilder()
                .setName("John Doe")
                .setAge(42)
                .build();
        return person;
    }

}
