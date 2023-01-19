package org.example;

public class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("I'm the runnable thread");
        System.out.println("Runnable thread done");
    }
}
