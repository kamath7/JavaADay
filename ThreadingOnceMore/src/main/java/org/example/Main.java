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

        RunnableThread runnableThread = new RunnableThread();
        runnableThread.run();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable from Anon Class");
            }
        };
        runnable.run();

        Runnable runnable1 = () -> {
            System.out.println("Lambda running");
            System.out.println("Lambda finished");
        };

        Thread thread = new Thread(runnable1);
        thread.start();
    }
}