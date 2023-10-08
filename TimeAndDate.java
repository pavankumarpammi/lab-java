import java.time.*;
import java.util.*;
public class TimeAndDate {
    public static void main(String[] args) {
        java.util.Date date =new java.util.Date();
        System.out.println(date);
        LocalTime time =LocalTime.now();
        System.out.println(time);
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        System.out.println(date1.getDayOfMonth()+" - "+date1.getMonthValue()+" - "+date1.getYear());
        List<Integer> list1=Arrays.asList(2,4,5,6,7);
        list1.forEach(i->System.out.println(i));
    }
}
