public class Main {
    String myName = "Aheli";

    public static void main(String[] args) {

        Main object1 = new Main();
        Main object2 = new Main();
        object2.myName = "Ashis";

        object2.printMe();
        object1.printMe();
    }

    private void printMe() {
        System.out.println("My name is "+ myName);
    }

    public void printOthers() {
        System.out.println("My name is "+ myName);
    }
}