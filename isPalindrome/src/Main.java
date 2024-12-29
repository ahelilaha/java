public class Main {
    public static void main(String[] args) {
        boolean Palindrome = Main.isPalindrome(11);
        System.out.println(Palindrome);
    }


    public static boolean isPalindrome(int number){
        return reverse(number) == number;
    }

    public static int reverse(int num){
        int result = 0;
        while(num > 0) {
            int lastDigit = num%10;
            result = (result * 10) + lastDigit;
            num = num/10;
        }
        System.out.println(result);
        return result;
    }
}