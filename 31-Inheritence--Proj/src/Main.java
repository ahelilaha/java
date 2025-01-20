public class Main {
    public static void main(String[] args) {
        BankAccount ahelisBankAccount = new PersonsBankAccount(
                1234567890,
                100.0,
                "Aheli Laha",
                "Ms.Chef@gmail.com",
                1234567890
        );
        Double balance = ahelisBankAccount.credit(100.0);

        try {
            balance = ahelisBankAccount.debit(210.0);
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
        ahelisBankAccount.accountBalance(balance);
        System.out.println(ahelisBankAccount.toString());

        BankAccount barnali = new PersonsBankAccount(
                1111111111,
                50.0,
                "Barnali Laha",
                "Mrs.Chef@gmail.com",
                987654321
        );
        System.out.println(barnali.toString());

        BankAccount ashis = new PersonsBankAccount(
                1234554321,
                1.0,
                "Ashis Laha",
                "Mr.Chef@gmail.com",
                1029384756
        );
        System.out.println(ashis.toString());
    }
}