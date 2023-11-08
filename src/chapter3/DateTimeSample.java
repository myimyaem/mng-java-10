package chapter3;
import java.time.*;

public class DateTimeSample {
    public static void main(String[] args) {
        System.out.println("LocalDate");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1 = LocalDate.of(2015, Month.FEBRUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println("LocalTime");
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(16, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(11, 15, 30, 200); // + nanoseconds
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println("LocalDateTime");
        LocalDateTime dateTime1 = LocalDateTime.of(2015,
            Month.DECEMBER, 25, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println("Date methods");
        System.out.println(date1+" Plus 12 days is "+ date1.plusDays(12));
        System.out.println(date1+" minus 12 days is "+ date1.minusDays(12));
        System.out.println(date2.plusDays(5).minusDays(8));
        System.out.println(date1+" Plus 3 months is "+ date1.plusMonths(3));
        System.out.println(date1+" minus 2 months is "+ date1.minusMonths(2));
        System.out.println(date1+" Plus 1 years is "+ date1.plusYears(1));
        System.out.println(date1+" minus 3 years is "+ date1.minusYears(3));
        System.out.println("Time methods");
        System.out.println(time1+" plus 3 hours is "+time1.plusHours(3));
        System.out.println(time1+" minus 3 hours is "+time1.minusHours(3));
        System.out.println(time1+" plus 30 minutes is "+time1.plusMinutes(30));
        System.out.println(time1+" minus 30 minutes is "+time1.minusMinutes(30));
        System.out.println(time2+" plus 120 seconds is "+time2.plusSeconds(120));
        System.out.println(time2+" minus 120 seconds is "+time2.minusSeconds(120));
        System.out.println(time3+" plus 300 nanoseconds is "+time3.plusNanos(300));
        System.out.println(time3+" minus 300 nanoseconds is "+time3.minusNanos(300));
        
        System.out.println(date1);
        date1 = date1.plusDays(30);
        System.out.println(date1);
        System.out.println("DateTime methods");
        // plus & minus (years,months,days,hours,minutes,seconds,nanos)
        System.out.println(dateTime1.plusDays(3).plusHours(24));
        // get date(dayOfWeek,dayOfMonth,dayOfYear)
        System.out.println("date Get methods");
        System.out.println(date1+" get day of month "+date1.getDayOfMonth());
        System.out.println(date1+" get day of week "+date1.getDayOfWeek());
        System.out.println(date1+" get day of year "+date1.getDayOfYear());
        
    }    
}
