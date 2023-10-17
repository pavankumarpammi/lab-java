import java.util.*;
import java.time.*;
class Sol{
 public static void main(String[] args) {
    Date date =new Date();
    System.out.println(date);
    LocalDate date1 =LocalDate.now();
    System.out.println(date1.getDayOfMonth()+"-"+date1.getMonthValue()+"-"+date1.getYear());

 }
}