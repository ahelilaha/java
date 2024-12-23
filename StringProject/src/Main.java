public class Main {
    public static void main(String[] args) {

        Main.testStringMethods();
        int minValue = Main.myMin(10, 3);
        System.out.println(minValue);
        System.out.println("Generate random number: "+ Math.random() * 100);
        System.out.println(10>90);
        Main.grade(21);
    }

    static void testStringMethods() {
        System.out.println("\bthis is an example of \"string\" ");
    }

    static int myMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // switch-case: case must be constant int, otherwise use if-elseif
    static void grade(int age) {
        switch (age) {
            case 10: {
                System.out.println("Grade 5");
                break;
            }
            case 11: {
                System.out.println("Grade 6");
                break;
            }
            case 12:{
                System.out.println("Grade 7");
                break;
            }
            default:
                System.out.println("You are old!");
                break;
        }
    }
}