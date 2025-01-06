import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> factors = findingFactors(12);
        // for-each
        for(Integer eachFactor : factors){
            System.out.println(eachFactor);
        }


        // for-index for reverse iterating
        int i = factors.size() - 1;
        for( ; i >= 0; i--) {
            Integer factor = factors.get(i);
            if(Main.isPrimeNumber(factor)){
                System.out.println("largest prime factor "+ factor);
                break;
            }
        }

        // for-index
//        for(int i = 0; i < factors.size(); i++) {
//            Integer factor = factors.get(i);
//            if(Main.isPrimeNumber(factor)){
//                System.out.println("largest prime factor "+ factor);
//                break;
//            }
//        }
    }

    public static ArrayList<Integer> findingFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        if (number < 1) {
            System.out.println("Invalid Value");
            return factors; // an empty array
        }

        for (int i = 1; i < number-1; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static boolean isPrimeNumber(int number){

        for(int i = 2; i < number; i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
