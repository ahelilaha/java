import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> factors = findingFactors(12);
        // for-each
        /*
        for(Integer eachFactor : factors){
           if (Main.isPrimeNumber(eachFactor)){
               System.out.println("largest prime factor "+eachFactor);
                break;
           }
        }
        */

        // for-index
        for(int i = 0; i < factors.size(); i++) {
            Integer factor = factors.get(i);
            if(Main.isPrimeNumber(factor)){
                System.out.println("largest prime factor "+ factor);
                break;
            }
        }
    }

    public static ArrayList<Integer> findingFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        if (number < 1) {
            System.out.println("Invalid Value");
            return factors; // an empty array
        }

        for (int i = number - 1; i > 0; i--) {
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
