public class Main {
    public static void main(String[] args) {
        System.out.println(Main.areaOfCircle(7));
        System.out.println(Main.areaOfRectangle(45, 75));
    }

    public static double areaOfCircle(double radius) {
        //Error case
        if(radius < 0){
            return -1.0;
        }
        double Pi = 3.14159265358979;
        return (Pi * radius * radius);
    }

    public static double areaOfRectangle(double x, double y) {
        //Error case
        if((x < 0) || (y < 0)){
            return -1.0;
        }

        return x * y;
    }
}