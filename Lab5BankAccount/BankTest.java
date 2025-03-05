public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        Account acc1 = new Account("ACC1001", 500.0);
        Account acc2 = new Account("ACC1002", -100.0); // starts at 0
        myBank.openAccount(acc1);
        myBank.openAccount(acc2);
        // Sample transactions
        acc1.withdraw(200);
        acc2.deposit(300);
        // List all accounts
        myBank.listAccounts();
        }
       }  

