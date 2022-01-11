package Day5;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import  java.util.Date;

// 과제9) java.util.Date, java.text.SimpleDateFormat 을 임포트하고 현재 날짜를 2021-12-31 23:59:59 로 출력하시오.
public class A9 {
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // 원하는 데이터 포맷 지정
        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));
    }
}