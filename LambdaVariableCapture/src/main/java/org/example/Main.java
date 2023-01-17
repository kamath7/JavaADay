package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final String someText = "Hello: ";
        MyInterface myInterface = (text) -> {
            System.out.println(someText+ " "+text);
        };
        myInterface.printIt(" World");
    }
}