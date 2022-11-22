import java.time.*;
// import java.lang.*;
// import java.util.*;

public class SimpleClient implements TimeClient {

    private LocalDateTime dateAndTime;

    public SimpleClient() {
        dateAndTime = LocalDateTime.now();
    }

    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(year, month, day);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }

    public void setDateAndTime(int day, int month, int year,
            int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(year, month, day);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }

    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }

    public String toString() {
        return dateAndTime.toString();
    }

    public static void main(String... args) {
        TimeClient myTimeClient = new SimpleClient();
        System.out.println(myTimeClient.toString());
        myTimeClient.setDate(18, 9, 2002);
        System.out.println(myTimeClient.toString());
        myTimeClient.setDateAndTime(27, 4, 2022, 17, 30, 59);
        System.out.println(myTimeClient.getLocalDateTime().toString());
        System.out.println(myTimeClient.getZonedDateTime("UTC+1"));
    }
}
