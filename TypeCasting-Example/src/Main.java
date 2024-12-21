public class Main {
    public static void main(String[] args) {
        Explore exp = new Explore();
        exp.testTypeCasting();
        exp.testDataOverflow();
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
}