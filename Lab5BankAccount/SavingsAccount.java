
public class SavingsAccount  {
    private double interestRate; // e.g., 3.5 = 3.5% annual
    public SavingsAccount(String accNumber, double initialBalance, double interestRate) {
    super(accNumber, initialBalance); // calls Account constructor
    this.interestRate = interestRate;
if (balance > 50 ) {
    balance -= amount;
}
else{ 
    System.out.println("Withdrawal denied.");
}
    
    public void applyInterest() {
    double interest = getBalance() * (interestRate / 100.0);
    deposit(interest); // reuse deposit() from Account
    System.out.println("Interest of p" + interest 
    + " applied to " + getAccountNumber());
    }
}