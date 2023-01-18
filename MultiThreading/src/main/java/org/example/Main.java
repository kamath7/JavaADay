package org.example;

public class Main {
    public static void main(String[] args) {

        MultiThreader multiThreader = new MultiThreader(1);
        MultiThreader multiThreader1 = new MultiThreader(2);
        MultiThreader multiThreader12 = new MultiThreader(3);

        multiThreader.start();
        multiThreader1.start();
        multiThreader12.start();
    }
}