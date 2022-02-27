package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

public class Account {
    private float balance;
    private String accountNumber;
    private Customer customer;

    public Account(float balance, String accountNumber, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void transferMoney(Account account, float amount) {
        if(isValidate(account, amount)) {
            //balance -= amount;
            this.setBalance((this.getBalance() - amount));
            account.setBalance(account.getBalance() + amount);
        }
    }

    private boolean isValidate(Account account, float amount) {
        return isValidAccountNumber(this)
                && isValidAccountNumber(account)
                && isValidAmount(amount);
    }

    private boolean isValidAccountNumber(Account account) {
        return account.getAccountNumber() != null && account.getAccountNumber().matches("[0-9]{26}");
    }

    private boolean isValidAmount(float amount) {
        return this.balance >= amount && amount > 0;
    }
}