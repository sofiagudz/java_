package practice;

import java.sql.Time;
import java.util.Date;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Interface_sum sum = (a, b, c) -> {return a+b+c;};
        int result = sum.suma(10, 20, 30);
        System.out.println(result);

        Interface_sum mult = (a, b, c) -> {return a*b*c;};
        int result1 = mult.suma(10, 20, 30);
        System.out.println(result1);


    }
    public interface Interface_time {
        int suma (Time time);
    }
    public interface Interface_date {
        int suma (Date time);
    }
}
