/**Filename:  BankApp
 * @version: 1.0
 * @author: Mwiche Dina Nachilongo 202208650
 * Program to: Test interface and abstract methods created
 * To compile: javac BankApp.java
 * To run: java BankApp
 */

import java.util.ArrayList;

public class  BankApp{
    public static void main (String [] args){

        List <BasicBankable> accounts = new ArrayList<>(); //Create arraylist
        accounts.deposit(new BasicBankable());
        accounts.deposit( new AdvancedBankable());

        for (double Bankable: accounts){
    System.out.println("Deposit(100.00,200.00)" + accounts.deposit(100.00,200.00));
    accounts.AccountInfo(); // calls default method in interface

    }
    BasicBankable bc = (BasicBankable) accounts.get(0);
    System.out.println("bc.Deposit(200.00,300.00): " +bc.deposit(200.00, 300.00));
    
    BasicBankable bc = (BasicBankable) accounts.get(0);
    System.out.println("bc.Deposit(200.00,300.00): " +bc.budget(200.00, 300.00));



}
}

