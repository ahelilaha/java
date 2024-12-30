import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        // Step 1: fetching date
        FetchDate fetchDate = new FetchDate();
        int day = fetchDate.fetchDay();
        if (day == -1) {
            System.out.println("Invalid day value, STOP!!!");
            exit(0);
        }

        int month = fetchDate.fetchMonth();
        if (month == -1) {
            System.out.println("Invalid month value, STOP!!!");
            exit(0);
        }

        int year = fetchDate.fetchYear();
        if (year == -1) {
            System.out.println("Invalid year value, STOP!!!");
            exit(0);
        }

        // step 2: building InputDate
        InputDate date = new InputDate(day, month, year);
        System.out.println(date.toString());

        // Step 3: validate inputDate


        // Step 4: Calculate odd days


    }
}


