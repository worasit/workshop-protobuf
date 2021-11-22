package com.daimongkol.protobuf.models;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
}
