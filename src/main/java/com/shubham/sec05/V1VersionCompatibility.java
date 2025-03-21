package com.shubham.sec05;

import com.google.protobuf.InvalidProtocolBufferException;
import com.shubham.models.sec05.v1.Television;
import com.shubham.sec05.parser.V1Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class V1VersionCompatibility {

    public static final Logger log = LoggerFactory.getLogger(V1VersionCompatibility.class);


    public static void main(String[] args) throws InvalidProtocolBufferException {


        var tv = Television.newBuilder()
                .setBrand("Samsung")
                .setYear(2022)
                .build();

        V1Parser.parser(tv.toByteArray());
        log.info("{}", tv);

    }
}
