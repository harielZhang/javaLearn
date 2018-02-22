package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    private static SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd:HH-mm-ss");

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        c.setTime(now);
        c.add(Calendar.MONTH, 2);
        c.set(Calendar.DATE, 1);
        c.set(Calendar.DATE, -3);
        System.out.println(c.getTime());
    }
}
