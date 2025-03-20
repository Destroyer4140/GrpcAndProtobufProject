package com.shubham.sec03;

import com.shubham.models.sec03.BodyStyle;
import com.shubham.models.sec03.Car;
import com.shubham.models.sec03.Dealer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec06Map {

    public static final Logger log = LoggerFactory.getLogger(Lec06Map.class);

    public static void main(String[] args) {

        var car1 = Car.newBuilder()
                .setMake("Toyota")
                .setModel("Camry")
                .setBodyStyle(BodyStyle.COUPE)
                .setYear(2020)
                .build();
        var car2 = Car.newBuilder()
                .setMake("Honda")
                .setBodyStyle(BodyStyle.SEDAN)
                .setModel("Civic")
                .setYear(2019)
                .build();
        var car3 = Car.newBuilder()
                .setMake("Ford")
                .setBodyStyle(BodyStyle.HATCHBACK)
                .setModel("Mustang")
                .setYear(2018)
                .build();

        var dealer = Dealer.newBuilder()
                .putInventory(car1.getYear(), car1)
                .putInventory(car2.getYear(), car2)
                .putInventory(car3.getYear(), car3)
                .build();

        log.info("{}", dealer);
    }
}
