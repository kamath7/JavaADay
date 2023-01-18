package org.example;

public class MultiThreader extends Thread  {
    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++){

            System.out.println(i);

            try {
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
