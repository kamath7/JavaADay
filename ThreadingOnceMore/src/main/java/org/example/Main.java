package org.example;

public class Main {
    //Way 1

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread running!");
            System.out.println("Thread done!");
        }
    }
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.run();
    }
}