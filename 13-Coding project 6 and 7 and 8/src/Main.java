public class Main {
    public static void main(String[] args) {
       boolean decimalComparator = Main.areEqualByThreeDecimalPlaces(3.14, 2.11);
       boolean sumChecker = Main.hasEqualSum(11, 17, 2);
       boolean numChecker = Main.hasTeen(23, 18, 87);
        System.out.println("Are the two decimals the same? " + decimalComparator);
        System.out.println("Is the first number + the next number = to the third number? " + sumChecker);
        System.out.println("Is one of the three numbers between  13-19? " + numChecker);
    }
    //DecimalComparator
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int resultNum1 = (int) (num1 * 1000);
        int resultNum2 = (int) (num2 * 1000);

        return resultNum1 == resultNum2;
    }

    //Equal Sum Checker
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return num1 + num2 == num3;

    }

    //Teen Number Checker
    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) ||
                (num2 >= 13 && num2 <= 19) ||
                (num3 >= 13 && num3 <= 19);
    }
}