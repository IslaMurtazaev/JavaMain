package headFirst;
import java.util.Date;
import java.util.Calendar;

public class DateAndCalendar {

    public static void main(String[] args) {

        String time = String.format("The time is %tr", new Date());
        String fullDate = String.format("It's is %tc", new Date());

        Date today = new Date();
        String dayOfWeek = String.format("%tA", today);
        String month = String.format("%tB", today);
        String dayOfMonth = String.format("%td", today);
        System.out.printf("Today is %s, %s %s\n", dayOfWeek, month, dayOfMonth);

        System.out.printf("Today is %tA, %<tb %<td\n\n", new Date()); // The same as above, but with one arg


        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 23, 40);
        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        System.out.println(day1);
        c.setTimeInMillis(day1);

        System.out.println("New hour is "+c.get(c.HOUR_OF_DAY));
        System.out.println(c.get(c.DAY_OF_MONTH));

        c.add(c.DATE, 35);
        System.out.println("35 days after "+c.get(c.DATE));

        c.roll(c.DATE, 35);
        System.out.println("35 days ahead, but without month being changed "+c.getTime());

        c.set(c.DATE, 1);
        System.out.println("Setting date to "+c.getTime());

        System.out.println(c.get(c.DATE));
        System.out.println(c.get(c.DAY_OF_MONTH));

    }

}
