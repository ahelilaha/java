public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main.shouldWakeUp(true, 11);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking == false) {
            // If Dog isn't barking at all!
            return false;

        } else if (hourOfDay < 0 || hourOfDay > 23) {
            // error case
            return false;

        } else if(hourOfDay < 8 || hourOfDay > 22) {
            return true;

        } else {
            return false;
        }

    }

    
}