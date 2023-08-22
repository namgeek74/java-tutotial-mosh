package com.helloworld;

import com.helloworld.ooppillars.*;
import com.helloworld.otherpackage.First;

public class Main {
    public static void main(String[] args) {
        DateTimeExample dateTimeExample = new DateTimeExample();
        dateTimeExample.getLocalDate();
        dateTimeExample.getLocalTime();
        dateTimeExample.logLocalDateTime();
        dateTimeExample.formatDateTime();
    }

}
