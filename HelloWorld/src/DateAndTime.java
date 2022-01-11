import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

public class DateAndTime {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        // 2016.2.7로 설정
        date.set(2016,2,7);
        date.add(Calendar.YEAR,2); // date.add(Calendar.JUNE,2) compile ok.

        // Date d = new Date();
        // Calendar cal = Calendar.getInstance();
        // cal.setTime(cal);

        System.out.println(System.currentTimeMillis());

        String result = sdf.format(new Date());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date result2 = sdf2.parse("2016-11-08");
            System.out.println(result2.toString());
            System.out.println(sdf2.format(result2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
