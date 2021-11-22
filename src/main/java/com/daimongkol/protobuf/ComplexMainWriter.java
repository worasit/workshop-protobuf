package com.daimongkol.protobuf;

import com.google.protobuf.util.JsonFormat;
import example.complex.Complex;
import example.complex.Complex.Building;
import lombok.extern.slf4j.Slf4j;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static example.complex.Complex.*;
import static example.complex.Complex.Address;

@Slf4j
public class ComplexMainWriter {
    public static void main(String[] args) throws IOException {
        log.info("Start Complex Main");
        Building.Builder builder = Building.newBuilder();
        Address.Builder addressBuilder = Address.newBuilder();
        Address address = addressBuilder.setAddressLine1("Baiyoke Tower II is an 88-story, 309 m skyscraper hotel at 222")
                .setAddressLine2("Ratchaprarop Road in the Ratchathewi District of Bangkok, Thailand.")
                .setDistrict("Ratchathewi")
                .build();


        Building biyokeTower = builder.setId(1)
                .setName("Biyoke Tower")
                .setAddress(address)
                .addAllRooms(
                        Arrays.asList(
                                createRoom(1, "Room A"),
                                createRoom(2, "Room B")
                        ))
                .build();

        FileOutputStream fileOutputStream = new FileOutputStream("complex_message.bin");
        biyokeTower.writeTo(fileOutputStream);

        FileOutputStream outputJson = new FileOutputStream("complex_message.json");
        String jsonOutput = JsonFormat.printer().print(biyokeTower);
        outputJson.write(jsonOutput.getBytes());
    }

    private static Room createRoom(int roomId, String roomName) {
        return Room.newBuilder().setId(roomId).setName(roomName).build();
    }
}
