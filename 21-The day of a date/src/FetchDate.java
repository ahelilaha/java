import java.util.*;

public class FetchDate {
    Scanner sc;

    /// constructor
    public FetchDate() {
        this.sc = new Scanner(System.in);
    }

    /// public methods
    public int fetchDay() {
        System.out.println("Give a day : ");
        int day = sc.nextInt();
        if(day < 1 || day > 31){
            return -1;
        } else {
            return day;
        }
    }

    public int fetchMonth() {
        System.out.println("Give a month : ");
        int month = sc.nextInt();
        if(month < 1 || month > 12){
            return -1;
        } else {
            return month;
        }
    }

    public int fetchYear() {
        System.out.println("Give a year : ");
        int year = sc.nextInt();
        if(year < 1) {
            return -1;
        } else {
            return year;
        }
    }
}
