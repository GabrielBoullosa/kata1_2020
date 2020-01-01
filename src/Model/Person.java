package Model;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;

    private final static int ms_per_s = 1000;
    private final static int s_per_m = 60;
    private final static int m_per_h = 60;
    private final static int h_per_d = 24;
    private final static double d_per_y = 365.5;
    private final static double ms_per_y = ms_per_s *
            s_per_m * m_per_h * h_per_d;
            
    
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        Date date = new Date();
        long ms = date.getTime() - birthday.getTime();
        return toYears(ms);
    }

    private int toYears(long ms) {
        return (int) (ms/ms_per_y);
    }
    
}
