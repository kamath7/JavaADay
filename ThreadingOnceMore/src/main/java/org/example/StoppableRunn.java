package org.example;

public class StoppableRunn implements Runnable {
    private boolean stopRequested= false;

    @Override
    public void run() {
        System.out.println("Stoppable running");
        while (!isStopRequested()) {
            sleep(1000);
            System.out.println("Taking a nap zzzz");
        }
        System.out.println("Stoppable died");
    }

    public synchronized void requestStop(){
        this.stopRequested = true;
    }

    public synchronized  boolean isStopRequested() {
        return this.stopRequested;
    }

    private void sleep(long milis){
        try{
            Thread.sleep(milis);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
