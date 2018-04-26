package derekBanasTut;
import java.util.*;
import java.text.DateFormat;

public class GetTime20 implements Runnable{

    public void run(){
        Date rightNow;
        Locale currentLocale;
        DateFormat timeFormat;
        DateFormat dateFormat;
        String timeOutput;
        String dateOutput;

        currentLocale = new Locale("kg");

        for (int i = 0; i < 20; i++) {
            rightNow = new Date();

            timeFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
            dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);

            timeOutput = timeFormat.format(rightNow);
            dateOutput = dateFormat.format(rightNow);

            System.out.println(i);
            System.out.println(timeOutput);
//            System.out.println(dateOutput);
            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
