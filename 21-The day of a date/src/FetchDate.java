import java.util.*;

public class FetchDate {
    Scanner sc;

    /// constructor
    public FetchDate() {
        this.sc = new Scanner(System.in);
    }

    /// public methods
    public int fetchYear () {
        System.out.println("Give a year : ");
        int year = sc.nextInt();
        if (year < 1) {
            return -1;
        } else {
            return year;
        }
    }

    public int fetchMonth () {
        System.out.println("Give a month : ");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            return -1;
        } else {
            return month;
        }
    }

    public int fetchDay(int year, int month) {
        System.out.println("Give a day : ");
        int upperLimitOfMonth = Utility.upperLimitOfAMonth(year, month);

        int day = sc.nextInt();
        if (day < 1 || day > upperLimitOfMonth) {
            return -1;
        } else {
            return day;
        }
    }
}

