package JE.Jungsuk.Chapter10;

import java.util.Calendar;

class CalendarEx4{
    public static void main(String[] args) {
        
        Calendar date = Calendar.getInstance();
        date.set(2022,00,06);  // 2022/01/06세팅 (0부터 시작)

        System.out.println(toString(date));
        System.out.println("= 1일후 =");
        date.add(Calendar.DATE,1);
        System.out.println(toString(date));
        
        System.out.println("= 6달전 =");
        date.add(Calendar.MONTH,-6);
        System.out.println(toString(date));

        System.out.println("= 31일후(roll) =");
        date.roll(Calendar.DATE,31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE,31);
        System.out.println(toString(date));
    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+date.get(Calendar.DATE)+"일";
    }
}