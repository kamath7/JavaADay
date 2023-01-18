package org.example;

public class Main {
    public static void main(String[] args) {

        MultiThreader multiThreader = new MultiThreader();
        multiThreader.start();
        MultiThreader multiThreader1 = new MultiThreader();
        multiThreader1.start();
    }
}