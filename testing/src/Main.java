public class Main {
    public static void main(String[] args) {
        Main.check(0,10);
        System.out.println();
    }
    public static void check(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            // check if i is an odd number
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}