import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        boolean isSharedDigit = Main.findOutCommonDigits(123456, 7890);
        String exploringSet = Main.friendsList();
        System.out.println(isSharedDigit);
        System.out.println(exploringSet);
    }

    public static boolean findOutCommonDigits(Integer a, Integer b) {
        // 1. iterate through each number, store each digit into a set
        // 2. compare two sets and find out intersection
        // 3. if intersection result is not an empty set then return true, else false
        HashSet<Integer> aDigitsSet = new HashSet<Integer>();
        HashSet<Integer> bDigitsSet = new HashSet<Integer>();

        while(a > 0) {
            Integer remainder = a % 10;
            a = a / 10;
            aDigitsSet.add(remainder);
        }
        while(b > 0) {
            Integer remainder = b % 10;
            b = b / 10;
            bDigitsSet.add(remainder);
        }
        System.out.println(aDigitsSet);
        System.out.println(bDigitsSet);

        // Now aDigitsSet contains intersected digits
        aDigitsSet.retainAll(bDigitsSet);
        return !aDigitsSet.isEmpty();
    }

    public static boolean hasSharedDigitForTwoDigitNumbers(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }

        int num1FirstDigit = num1 / 10;
        int num1LastDigit = num1 % 10;

        int num2FirstDigit = num2 / 10;
        int num2LastDigit = num2 % 10;

        return (num1FirstDigit == num2FirstDigit) ||
                (num1FirstDigit == num2LastDigit) ||
                (num1LastDigit == num2FirstDigit) ||
                (num1LastDigit == num2LastDigit);
    }

    public static String friendsList (){
        HashSet<String> friends = new HashSet<String>();
        friends.add("Diya");
        System.out.println(friends);
        friends.add("Navya");
        System.out.println(friends);
        friends.add("Rebeca");
        System.out.println(friends);
        friends.remove("Diya");
        System.out.println(friends);
        friends.contains("Diya");
        friends.clear();
        System.out.println(friends);
        return "It worked!!!";

    }
}