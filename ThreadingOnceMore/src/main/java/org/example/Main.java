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

        Runnable runnable2 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Lambda finished from "+threadName);
        };

        Thread thread1 = new Thread(runnable2, "ThreadYOLO");
        thread1.start();

        Runnable runnable3 = () -> {
            String threadName = Thread.currentThread().getName();

            try {
                Thread.sleep(3);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Thread finished!");
        };

        Thread thread3 = new Thread(runnable3, "NiceThread");
        thread3.start();

        StoppableRunn stoppableRunn = new StoppableRunn();
        Thread thread4 = new Thread(stoppableRunn, "Threaddd");
        thread4.start();

        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Requesting stop");
        stoppableRunn.requestStop();
        System.out.println("Thread stopped!");

    }
}