/**Filename: Account.java
 * @version: 1.0
 * @author: Not specified (Code provided)
 * To compile: javac Account.java
 * To run: java Account 
 */
public class Account{
    private static String accountNumber;
        private double balance;
        private static String accNum;
                private static String empty = "";
                                
                                public Account(String accountNumber, double initialBalance){
                                    his.accountNumber= accountNumber;
                                    if (initialBalance < 0) {
                                        initialBalance = 0.0;
                                         }
                                         this.initialBalance= initialBalance;
                                        }
                            
                                         public void deposit (double amount){
                                            if (amount > 0) {
                                                balance += amount;    
                                            }
                            
                                         }
                                         public void withdrawal (double amount){
                                            if (amount > 0 && amount <= balance) {
                                                balance -= amount;   
        
                                            } if (balance > 50 ) {
                                                balance -= amount;
                                            }
                                            else{ 
                                                System.out.println("Withdrawal denied.");
                                            }
                            
                                         }
                                         public double getBalance(){
                                            return balance;
                            
                                         }
                                          public String getAccountNumber(){
                                            return accountNumber;
                                          }
                            //Method to eliminate duplicate accounts
                                          public static String closeAccount ( accNum accountNumber){
                                            if (accountNumber.equalsIgnoreCase(accNum)) {
                                                return empty; 
                            //To call method
                                             closeAccount(empty);
                        
                    }
              }
}