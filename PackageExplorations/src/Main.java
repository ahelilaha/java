import cards.Uno;
import scientific.Calculator;

public class Main {
    public static void main(String[] args) {
        normal.Calculator normalCalculator = new normal.Calculator();
        System.out.println(normalCalculator.add(10, 20 ));

        Calculator sciCalculator = new Calculator();
        System.out.println(sciCalculator.power(3, 3));

        Uno uno = new Uno();
        System.out.println(uno.getACardNumber());
    }
}