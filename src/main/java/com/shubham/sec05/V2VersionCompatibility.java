package com.shubham.sec05;

import com.google.protobuf.InvalidProtocolBufferException;
import com.shubham.models.sec05.v2.Television;
import com.shubham.models.sec05.v2.Type;
import com.shubham.sec05.parser.V2Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class V2VersionCompatibility {

    public static final Logger log = LoggerFactory.getLogger(V2VersionCompatibility.class);


    public static void main(String[] args) throws InvalidProtocolBufferException {


        var tv = Television.newBuilder()
                .setBrand("Samsung")
                .setModel(2022)
                .setType(Type.HD)
                .build();

        V2Parser.parser(tv.toByteArray());
        log.info("{}", tv);

    }
}
