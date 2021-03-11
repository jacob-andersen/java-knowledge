import java.util.Calendar;
import java.util.GregorianCalendar;

// Utility function that will be needed for Java based Learning application
// To determined when it is time to practice a topic again, before it is forgotten

public class DateDifference {
    static class Day {
        int day;
        int month;
        int year;
    }

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(month + "/" + dayOfMonth + "/" + year);

        String message = "";
        Day lastDay = new Day();

        lastDay.day = 8;
        lastDay.month = 0;
        lastDay.year = 2021;

        // message = (lastDay.day < dayOfMonth && lastDay.month <= month && lastDay.year <= year) ? "Time to study AGAIN!" : "";
        
        if (lastDay.year <= year) {
            if (lastDay.month <= month) {
                if (lastDay.day <= dayOfMonth - 2) {
                    message = "Time to study AGAIN!";
                }
            }
        }

        System.out.println(message);
    }
}
