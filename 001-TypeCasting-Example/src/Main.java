public class Main {
    public static void main(String[] args) {
        Explore exp = new Explore();
        exp.testTypeCasting();
        exp.testDataOverflow();
        exp.testOperator();
        Explore.checkNumber(0);
    }
}

class Explore {
    void testTypeCasting() {
        int a = 5;
        System.out.println(a);
        double b = a;
        System.out.println(b);
        byte c = (byte) a;
        System.out.println(c);
    }

   void testDataOverflow() {
        byte d = (byte) 128;
        System.out.println(d);
    }

    void testOperator() {
        System.out.println(10 ^ 16); // bitwise exclusive OR
        System.out.println(8 & 7); // bitwise AND
        System.out.println(8 | 7); // bitwise OR
    }

    public static void checkNumber(int number) {
        if(number > 0) {
            System.out.println("positive");
        } else if(number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}