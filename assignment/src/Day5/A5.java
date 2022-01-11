package Day5;


public class Time {
    
Time t = new Time();
t.hour = 25;

private int hour;
private int minute;
private int second;

public Time(int i, int j, int k) {
}
public int getHour() { return hour; }
public void setHour(int hour) {
    if (hour < 0 || hour > 23) return;
    this.hour = hour;
}

public int getMinute() { return minute; }
public void setMinute(int minute) {
    if (minute < 0 || minute > 59) return;
    this.minute = minute;
}

public int getSecond() { return second; }
public void setSecond(int second) {
    if (second < 0 || second > 23) return;
    this.second = second;
}
public Time getT() {
    return t;
}
public void setT(Time t) {
    this.t = t;
}
}

public class A5 {
public static void main(String[] args) {
    Time t = new Time(12, 35, 30);
    System.out.println(t);
    // t.hour = 13;
    t.setHour(t.getHour() + 1);
    System.out.println(t);
}
}