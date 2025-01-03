public class Main {
    public static void main(String[] args) {
        for(Integer i = 1; i <= 1000000; i++){
            boolean perfectNumber = Main.isPerfectNumber(i);
            if (perfectNumber) {
                System.out.println(i);
                factor(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1){
            return false;
        }

        int sum = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        return sum == number;
    }

    public static void factor(int num) {
        System.out.println("printing factors");
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}