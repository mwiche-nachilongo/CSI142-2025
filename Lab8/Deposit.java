/**Filename:  Deposit
 * @version: 1.0
 * @author: Mwiche Dina Nachilongo 202208650
 * Program to: demonstrate abstract class creation
 * To compile: javac Deposit.java
 */

public abstract class Deposit{
    public double finalAccountBalance;
    public void details(){
        System.out.println("The final account balance after withdrawing is," +finalAccountBalance);// abstract method
    }
}