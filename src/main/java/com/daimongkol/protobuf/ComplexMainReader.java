package com.daimongkol.protobuf;

import example.complex.Complex;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;

@Slf4j
public class ComplexMainReader {
    public static void main(String[] args) throws IOException {
        log.info("Application Started");
        FileInputStream fileInputStream = new FileInputStream("complex_message.bin");
        Complex.Building building = Complex.Building.parseFrom(fileInputStream);
        log.info(building.toString());
    }
}
