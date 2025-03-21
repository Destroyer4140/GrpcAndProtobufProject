package com.shubham.sec05.parser;

import com.google.protobuf.InvalidProtocolBufferException;
import com.shubham.models.sec05.v2.Television;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class V2Parser {

    public static final Logger log = LoggerFactory.getLogger(V2Parser.class);

    public static void parser(byte[] bytes) throws InvalidProtocolBufferException {

        var tc = Television.parseFrom(bytes);
        log.info("brand: {}", tc.getBrand());
        log.info("model: {}", tc.getModel());
        log.info("type: {}", tc.getType());
    }
}
