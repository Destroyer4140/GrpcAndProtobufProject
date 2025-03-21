package com.shubham.sec04;

import com.shubham.models.sec04.Person;
import com.shubham.models.sec04.common.Address;
import com.shubham.models.sec04.common.BodyStyle;
import com.shubham.models.sec04.common.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec01Import {

    public static final Logger log = LoggerFactory.getLogger(Lec01Import.class);

    public static void main(String[] args) {

        var address = Address.newBuilder()
                .setStreet("123 Main St")
                .setCity("Anytown")
                .setState("CA")
                .build();
        log.info("{}", address);

        var car = Car.newBuilder()
                .setMake("Toyota")
                .setModel("Camry")
                .setBodyStyle(BodyStyle.COUPE)
                .setYear(2020)
                .build();
        log.info("{}", car);

        var person = Person.newBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(42)
                .setAddress(address)
                .setCar(car)
                .build();
        log.info("{}", person);
    }
}
