package derekBanasTut;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import static java.util.concurrent.TimeUnit.*;

public class Tutorial18 {

    public static void main(String[] args) {

        addThreadsToPool();

    }

    public static void addThreadsToPool(){

        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5); // Create a pool for Threads

        eventPool.scheduleAtFixedRate(new GetTime20(), 0, 1, SECONDS); // LOOP
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 3, 5, SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, SECONDS);

//        eventPool.schedule(new GetTime20(), 0, SECONDS); // ONE TIME execution


        System.out.println("Number of Threads "+ Thread.activeCount());

        Thread[] arrayOfThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(arrayOfThreads);

        System.out.println(arrayOfThreads[3].getName());
        arrayOfThreads[3].setPriority(10);

        for (Thread t : arrayOfThreads) {
            System.out.println(t.getName());
            System.out.println(t.getPriority());
        }



    }

}
