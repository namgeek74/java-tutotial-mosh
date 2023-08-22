package com.helloworld;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

    public void getLocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }

    public void getLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }

    public void logLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    public void formatDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Before format: " + localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = localDateTime.format(formatter);
        System.out.println("After format: " + formattedDate);
    }
}
