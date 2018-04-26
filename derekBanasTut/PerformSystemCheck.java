package derekBanasTut;

import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable{
    private String checkWhat;
    ReentrantLock lock = new ReentrantLock();

    public PerformSystemCheck(String checkWhat){
        this.checkWhat = checkWhat;
    }

    public void run(){
        lock.lock();
        System.out.println("Checking "+checkWhat);
        lock.unlock();
    }

//    synchronized public void run(){ // Also locks the method, but slows the program
//        System.out.println("Checking "+checkWhat);
//    }

}
