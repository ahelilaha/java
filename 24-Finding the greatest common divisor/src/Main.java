public class Main {
    public static void main(String[] args) {
        int GCD = Main.getGreatestCommonDivisor(12, 15);
        System.out.println(GCD);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int divisor = -1;
        int divident = -1;

        if(first <= second){
            divisor = first;
            divident = second;
        } else{
            divisor = second;
            divident = first;
        }

        int remainder = divident % divisor;

        while(remainder != 0){
            divident = divisor;
            divisor = remainder;

            remainder = divident % divisor;
        }

        return divisor;
    }
}