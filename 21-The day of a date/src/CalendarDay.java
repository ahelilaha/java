public class CalendarDay {

    public String calculate(InputDate date) {
        // 1. divide year into 400 and check remainders - r400
        // 2. calculate odd days till (r400-1) years
        int year = date.getYear();
        int r400 = (year % 400) - 1; // remove 1 as we are processing till last year

        int year100 = r400 / 100;
        int oddDaysForR100 = year100 * 5;

        // 3. calculate leap year and non-leap year in r100
        int r100 = r400 % 100; // remainder after 100 years
        int leapYears = r100 / 4;
        int ordinaryYears = (r100 - leapYears);
        int oddDaysNon100 = (leapYears * 2 + ordinaryYears);

        int totalOddDaysForR400 = oddDaysNon100 + oddDaysForR100;

        // 4. calculate for final year --> 01.01.year to date (number of days) - days
        int sumDays = 0;
        for (int i = 1; i < date.getMonth(); i++) {
            sumDays = sumDays + Utility.upperLimitOfAMonth(year, i);
        }
        sumDays = sumDays + date.getDay();
        int oddDaysInLastYear = sumDays % 7;
        int oddDay =  (totalOddDaysForR400 + oddDaysInLastYear) % 7;
        return mapNumberToDay(oddDay);
    }

    private String mapNumberToDay(int day) {
        switch (day) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Invalid";
        }
    }
}
