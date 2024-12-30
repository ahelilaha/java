import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        // Step 1: fetching date & validate it
        FetchDate fetchDate = new FetchDate();
        int year = fetchDate.fetchYear();
        if (year == -1) {
            System.out.println("Invalid year value, STOP!!!");
            exit(0);
        }

        int month = fetchDate.fetchMonth();
        if (month == -1) {
            System.out.println("Invalid month value, STOP!!!");
            exit(0);
        }

        int day = fetchDate.fetchDay(year, month);
        if (day == -1) {
            System.out.println("Invalid day value, STOP!!!");
            exit(0);
        }

        // step 2: building InputDate
        InputDate date = new InputDate(day, month, year);
        System.out.println(date.toString());

        // Step 3: Calculate odd days
        CalendarDay calendarDay = new CalendarDay();
        String oddDay = calendarDay.calculate(date);
        System.out.println("Day is " + oddDay);
    }
}


