package org.example;

public class VirtualThread{
//Note to self - Install Project LOOM jar file
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i =0 ; i < 10 ; i++){
                System.out.println("Index "+i);
            }
        };

        Thread vThread1 = Thread.ofVirtual().start(runnable);

    }
}
