package com.daimongkol.protobuf;

import example.enumerations.EnumExample;

import static example.enumerations.EnumExample.*;

public class EnumMainWriter {
    public static void main(String[] args) {
        System.out.println("Enumeration Writer Started");

        EnumMessage.Builder builder = EnumMessage.newBuilder();
        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.MONDAY;
        builder.setId(1)
                .setDayOfTheWeek(dayOfTheWeek);

        final EnumMessage enumMessage = builder.build();
        System.out.println(enumMessage);
    }
}
