package com.shubham.sec03;

import com.shubham.models.sec03.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lec02Serialization {

    private static final Logger log = LoggerFactory.getLogger(Lec02Serialization.class);
    public static final Path PATH = Path.of("person.out");
    public static void main(String[] args) throws IOException {

        Person person = Person.newBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(42)
                .setEmail("a@b.com")
                .setEmployed(true)
                .setSalary(100.0)
                .setBankAccountNumber(123456789L)
                .setBalance(-100)
                .build();
        serialize(person);
        log.info("{}", deserialize());
        log.info("equals: {}", person.equals(deserialize()));

    }

    public static void serialize(Person person) throws IOException {
        try(var stream = Files.newOutputStream(PATH)) {
            person.writeTo(stream);
        }
    }

    public static Person deserialize() throws IOException {
        try(var stream = Files.newInputStream(PATH)) {
            return Person.parseFrom(stream);
        }
    }
}
