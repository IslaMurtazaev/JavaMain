package derekBanasTut;

public class Tutorial17 extends Thread{

    public static void main(String[] args) {

        Runnable getTime = new GetTime20();
        Runnable getMail = new GetTheMail(3);
        Runnable getMailAgain = new GetTheMail(10);
        Runnable getLastMail = new GetTheMail(19);

        new Thread(getTime).start();
        new Thread(getLastMail).start();
        new Thread(getMailAgain).start();
        new Thread(getMail).start();

    }

}
