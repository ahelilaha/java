public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main.printYearsAndDays(7429098);
        Main.printEqual(23, 45, 45);
        System.out.println(isCatPlaying(true, 30));
    }

    //Minutes To Years and Days Calculator
    public static void printYearsAndDays(long minutes) {
        //Error case
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long years = minutes/525600;
            long days = (minutes%525600)/1440;

            System.out.println(minutes + " Min = " + years + " Years and " + days + " Days");

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
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }
}