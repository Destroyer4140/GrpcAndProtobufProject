package com.shubham.sec03;

public record JsonPerson(String firstName, String lastName, int age
    , String email, boolean employed, double salary, long bankAccountNumber, int balance) {
}
