package org.example;

import static java.lang.Thread.sleep;

public class Daemonss {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            while(true){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Runningg");
            }
        };

        Thread thread = new Thread (runnable);
        thread.setDaemon(true);
        thread.start();
        sleep(3100);
    }
}
