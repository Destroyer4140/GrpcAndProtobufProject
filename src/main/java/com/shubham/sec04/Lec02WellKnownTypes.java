package com.shubham.sec04;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import com.shubham.models.sec04.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;

public class Lec02WellKnownTypes {

    public static final Logger log = LoggerFactory.getLogger(Lec02WellKnownTypes.class);


    public static void main(String[] args) {

        var sample = Sample.newBuilder()
                .setAge(Int32Value.of(42))
                .setTimestamp(Timestamp.newBuilder().setSeconds(Instant.now().getEpochSecond()).build())
                .build();
        log.info("{}", sample);
    }
}
