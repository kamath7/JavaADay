package org.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        MyInterface myInterface = (String text) -> {
            System.out.println("Hello there, "+text);
        };

        myInterface.printIt("Adithya");
        myInterface.printUtf8To("Hello there",new FileOutputStream("lalle.txt"));

        MyInterface.printItToSystemOut("Nice");
    }
}