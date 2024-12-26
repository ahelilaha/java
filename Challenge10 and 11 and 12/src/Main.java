public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main.printYearsAndDays(1440000);
        Main.printEqual(45, 4, 0);
        System.out.println(isCatPlaying(true, 30));
    }

    //Minutes To Years and Days Calculator
    public static void printYearsAndDays(long minutes) {
        //Error case
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            // 365 days in a year
            // A day has 24 hours
            // An hour has 60 mins
            final long minsPerDay = 60*24;
            final long minuesPerYear = minsPerDay*365;
            long years = minutes/minuesPerYear;
            long days = (minutes%minuesPerYear)/minsPerDay;
            long mins = (minutes%minsPerDay);
            System.out.println(minutes + " Min = " + years + " Years and " + days + " Days " + mins + " mins");

        }
    }

    //Equality Printer
    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Some are equal but Not all");
        }
    }

    //Playing Cat
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int tempUpperLimit = 35;
        if (summer) {
            tempUpperLimit = 45;
        }

        return (temperature >= 25 && temperature <= tempUpperLimit);
    }
}