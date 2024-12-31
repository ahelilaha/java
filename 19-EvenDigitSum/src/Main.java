public class Main {
    public static void main(String[] args) {
        int isEven = Main.getEvenDigitSum(16174);
        System.out.println(isEven);
    }

    public static int getEvenDigitSum(int number){
        //Error Case
        if(number < 0){
            return -1;
        }

        int Sum = 0;
        int lastDigit;

        while(number > 0){
            lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                Sum = Sum + lastDigit;
            }
            number = number/10;
        }

        return Sum;
    }
}