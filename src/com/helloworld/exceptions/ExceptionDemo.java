package com.helloworld.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class ExceptionDemo {
    public static void show() {
        FileReader reader = null;
        try {
            // checked exception
            reader = new FileReader("file.txt");
            // unchecked exception (only throw in runtime)
            logName(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }

    public static void logName(String name) {
        System.out.println(name.toUpperCase());
    }
}
