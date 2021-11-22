package com.daimongkol.protobuf;

import java.io.FileInputStream;
import java.io.IOException;

import static example.simple.Simple.SimpleMessage;

public class SimpleMainReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("simple_message.bin");
        SimpleMessage simpleMessage = SimpleMessage.parseFrom(fileInputStream);
        System.out.println(simpleMessage.toString());
    }
}
