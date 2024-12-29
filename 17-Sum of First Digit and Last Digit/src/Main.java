public class Main {
    public static void main(String[] args) {
        int sumOfFirstAndLast = Main.sumFirstAndLastDigit(112);
        int theSumOfFirstAndLastDigit = Main.sumoffirstandlastdigit(111);

        System.out.println(sumOfFirstAndLast);
        System.out.println(theSumOfFirstAndLastDigit);
    }

    public static int sumFirstAndLastDigit(int number) {
        //Error case
        if(number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        double firstDigit = number;

        while(firstDigit >= 1){
            firstDigit = firstDigit/10;
        }

        firstDigit = firstDigit * 10;
        int firstdigitInInt = (int) firstDigit;
        return firstdigitInInt + lastDigit;
    }


    public static int sumoffirstandlastdigit(int num){
        //Error case
        if(num < 0) {
            return -1;
        }

        int lastDigit = num % 10;
        int firstDigit = num;

        while(num > 0){
            firstDigit = num%10;
            num = num/10;
        }

        return lastDigit + firstDigit;
    }
}