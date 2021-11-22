package com.daimongkol.protobuf;

import com.google.protobuf.util.JsonFormat;
import example.simple.Simple.SimpleMessage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SimpleMessage.Builder builder = SimpleMessage.newBuilder();

        // Simple field
        builder.setId(42)
                .setIsSimple(true)
                .setName("My Simple Message Name");

        // repeated field
        builder.addSampleList(1)
                .addSampleList(2)
                .addSampleList(3)
                .addAllSampleList(Arrays.asList(4, 5, 6));

        System.out.println(builder.toString());
        SimpleMessage simpleMessage = builder.build();


        try {
            // write the protocol buffers binary to a file
            FileOutputStream binaryOutputStream = new FileOutputStream("simple_message.bin");
            simpleMessage.writeTo(binaryOutputStream);

            // write the protocol buffers json to a file
            FileOutputStream jsonOutputStream = new FileOutputStream("simple_message.json");
            String jsonMessage = JsonFormat.printer().print(simpleMessage);
            jsonOutputStream.write(jsonMessage.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Send to network
        byte[] bytes = simpleMessage.toByteArray();
    }
}
