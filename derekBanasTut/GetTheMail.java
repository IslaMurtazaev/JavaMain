package derekBanasTut;

public class GetTheMail implements Runnable{ // THREADS
    private int startTime;

    public GetTheMail(int start){
        startTime = start;
    }

    public void run(){
        try{
            Thread.sleep(startTime * 1000);
            System.out.println("Checking the mail");
        } catch (InterruptedException ex){}
    }
}
