public class Bank {
    double withdraw;
    double balance;
    double deposit;
    public Bank(double balance) {
        this.balance = balance;
    }
    // check balance
    public double getBalance(){
        return balance;
    }
    // withdraw
    public double withdraw(double withdraw) {
        if (balance < withdraw) {
            //  System.out.println("Insufficient Balance ");
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance = balance - withdraw;
        return balance;
    }
    // deposit
    public double deposit(double deposit) {
        balance = balance + deposit;
        return balance;
    }
}