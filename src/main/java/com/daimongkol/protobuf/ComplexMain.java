package com.daimongkol.protobuf;

import com.daimongkol.protobuf.models.Student;

public class ComplexMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id(1)
                .firstName("worasit")
                .lastName("daimongkol")
                .build();
        System.out.println(student.toString());
    }
}
