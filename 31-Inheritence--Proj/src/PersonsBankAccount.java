public class PersonsBankAccount implements BankAccount{
    private Integer accountNumber;
    private Double accountBalance;
    private String customerName;
    private String email;
    private Integer phoneNumber;
    private Double credit;
    private Double debit;

    //Constructer
    PersonsBankAccount(Integer accountNumber,
                       Double accountBalance,
                       String customerName,
                       String email,
                       Integer phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Integer accountNumber() {
        return accountNumber;
    }

    @Override
    public Double accountBalance(Double balance) {
        return accountBalance;
    }

    @Override
    public String customerName() {
        return customerName;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public Integer phoneNumber() {
        return phoneNumber;
    }

    @Override
    public Double credit(Double amount) {
        accountBalance = accountBalance + amount;
        return accountBalance;
    }

    @Override
    public Double debit(Double amount) {
        // if  available balance is more than amount then you can withdraw, otherwise throw an error
        if (amount > accountBalance) {
            throw new RuntimeException("Amount insufficient!!!");
        }
        accountBalance = accountBalance - amount;
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Hello, I am " + customerName
                + ". I have $" + accountBalance
                + ". My account number is  " + accountNumber
                + ". My email is " + email
                + ". My phone number is " + phoneNumber;
    }

}
