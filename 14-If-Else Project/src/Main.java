public class Main {
    public static void main(String[] args) {
        long km = Main.toMilesPerHour(10);
        System.out.println(km);

        Main.printConversion(10);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return -1;
        }

        long milesperhour = (long)(kilometersPerHour/1.5);
        return milesperhour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double miles = kilometersPerHour / 1.5;
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
}