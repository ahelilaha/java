public class Main {
    public static void main(String[] args) {
        int year = 1112;
        boolean isLeapYear = Main.isLeapYear(year);
        System.out.println("is " + year + " a leap year? " + isLeapYear);
    }
    // The purpose of this method is to calculate leap year
    public static boolean isLeapYear(int year){
        // error case
        if (year < 1 || year > 9999) {
            return false;
        }

        // leap year Calculation
        if(year%4 == 0) {
            if(year%100 == 0) {
                return (year%400 == 0);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}