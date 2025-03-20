package com.shubham.sec03;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.shubham.models.sec03.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Lec03PerformanceTest {

    private static final Logger log = LoggerFactory.getLogger(Lec03PerformanceTest.class);
    private static final ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) {

        Person protoPerson = Person.newBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(42)
                .setEmail("a@b.com")
                .setEmployed(true)
                .setSalary(100.0)
                .setBankAccountNumber(123456789L)
                .setBalance(-100)
                .build();
        var jsonPerson = new JsonPerson("John", "Doe", 42, "a@b.com", true, 100.0, 123456789L, -100);

        for (int i=0; i<5; i++) {
            runTest("proto", () -> proto(protoPerson));
            runTest("json", () -> json(jsonPerson));
        }
    }

    private static void proto(Person person) {

        try {
            var bytes = person.toByteArray();
            Person.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }

    private static void json(JsonPerson person) {
        try {
            var bytes = mapper.writeValueAsBytes(person);
            mapper.readValue(bytes, JsonPerson.class);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void runTest(String tastName, Runnable test) {
        var start = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            test.run();
        }
        var end = System.currentTimeMillis();
        log.info("time taken for {} - {} ms", tastName, end - start);
    }
}
