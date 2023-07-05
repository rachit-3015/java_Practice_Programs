import java.util.*;
import java.util.stream.*;
import java.time.*;

public class DateDifference{
    public static void main(String [] args){
        LocalDate localDate1 = LocalDate.of(2023,6,8);
        LocalDate localDate2 = LocalDate.of(1999,4,30);
        Period period = Period.between(localDate2,localDate1);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }
}