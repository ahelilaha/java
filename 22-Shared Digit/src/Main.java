public class Main {
    public static void main(String[] args) {
        boolean isSharedDigit = Main.hasSharedDigit(19, 99);
        System.out.println(isSharedDigit);
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }

        int num1FirstDigit = num1 / 10;
        int num1LastDigit = num1 % 10;

        int num2FirstDigit = num2 / 10;
        int num2LastDigit = num2 % 10;

        if((num1FirstDigit == num2FirstDigit) || (num1FirstDigit == num2LastDigit) || (num1LastDigit == num2FirstDigit) || (num1LastDigit == num2LastDigit)){
            return true;
        }else {
            return false;
        }

    }
}