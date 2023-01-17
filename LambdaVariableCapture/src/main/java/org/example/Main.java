package org.example;

import java.io.IOException;

public class Main {

    static String third = "Another one";//static variable
    private String fourth = "Fourth one";//member variable

    public void doIt(){
        final String someText = "Hello: ";
        MyInterface myInterface = (text) -> {
            System.out.println(someText+ " "+text+" "+third+" "+fourth);
        };
        third = "blah blah";
        fourth = "Ooo lalala";
        myInterface.printIt(" World");// Hello: World blah blah
    }

    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.doIt();
    }
}