package com.daimongkol.protobuf;

import com.daimongkol.protobuf.models.Student;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComplexMain {
    public static void main(String[] args) {
        log.info("Start Complex Main");
        Student student = Student.builder()
                .id(1)
                .firstName("worasit")
                .lastName("daimongkol")
                .build();
        System.out.println(student.toString());
    }
}
