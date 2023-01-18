package org.example;

public class RunnaBoy implements  Runnable{

    private int threadNum;
    public RunnaBoy(int threadNum){
        this.threadNum = threadNum;
    }
    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++){

            System.out.println("From Thread"+threadNum+"->"+i);
            if (threadNum == 3){
                throw new RuntimeException("NO!");
            }
            try {
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
