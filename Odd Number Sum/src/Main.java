public class Main {
    public static void main(String[] args) {
        boolean checking = Main.isOdd(11);
        int theSum = Main.sumOdd(2, 11);
        System.out.println(checking);
        System.out.println(theSum);
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }


    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}