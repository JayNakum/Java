class Time {
    private int m_Hour, m_Minute;

    public Time(int hour, int minute) {
        m_Hour = hour;
        m_Minute = minute;
    }

    public void setHour(int hour) {
        m_Hour = hour;
    }
    public void setMinute(int minute) {
        m_Minute = minute;
    }

    public int getHour() {
        return m_Hour;
    }
    public int getMinute() {
        return m_Minute;
    }

    public String getTime() {
        return "[" + m_Hour + " : " + m_Minute + "]";
    }
}

public class Q01 {
    public static Time addTime(Time obj1, Time obj2) {
        int minute = (obj1.getMinute() + obj2.getMinute()) % 60;
        int hour = (obj1.getHour() + obj2.getHour()) + (minute / 60);
        return new Time(hour, minute);
    }
    public static void main(String[] args) {
        Time obj1 = new Time(3, 36);
        Time obj2 = new Time(2, 30);

        Time result = Q01.addTime(obj1, obj2);
        
        System.out.println(obj1.getTime() + " + " + obj2.getTime() + " = " + result.getTime());
    }
}
