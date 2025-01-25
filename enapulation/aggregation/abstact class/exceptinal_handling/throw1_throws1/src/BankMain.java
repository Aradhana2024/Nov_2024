public class BankMain {
    public static void main(String[] args) throws InsufficientBalanceException{
        Bank bank = new Bank(1000);
        double balance = bank.getBalance();
        System.out.println("Current Balance : "+ balance);
        double balanceAfterWithdraw = 0;
        balanceAfterWithdraw = bank.withdraw(5000);
        System.out.println("Balance after 1000 withdraw  : "+balanceAfterWithdraw);
        System.out.println("End of line.,.");
    }
}
