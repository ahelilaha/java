public interface BankAccount {
    Integer accountNumber();
    Double accountBalance(Double balance);
    String customerName();
    String email();
    Integer phoneNumber();

    /// adding `amount` money into account
    Double credit(Double amount);

    /// withdrawing `amount` from account if account balance is more than the `amount`
    Double debit(Double amount);
}
