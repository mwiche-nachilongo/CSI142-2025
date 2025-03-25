/**Filename:  AdvancedBankable
 * @version: 1.0
 * @author: Mwiche Dina Nachilongo 202208650
 * Program to: demonstrate interface implementation
 * To compile: javac AdvancedBankable.java
 */

 public class AdvancedBankable implements Bankable{
    protected double initialBalance;
    protected double finalBalance;
    protected float unroundedInitialBalance;
    protected float unroundedFinalBalance;
    protected int depositcount;

    public AdvancedBankable(double initialBalance, double finalBalance, float unroundedInitialBalance, float unroundedFinalBalance){
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
        this.unroundedFinalBalance = unroundedFinalBalance;
        this.unroundedInitialBalance= unroundedFinalBalance;

    }
    @Override
    public double deposit (double initialBalance, double finalBalance){
        return initialBalance + finalBalance; //Demonstrating overriding
    }
    @Override
public double withdraw(double initialBalance, double finalBalance){
    return finalBalance - initialBalance;// Demonstrating overridding
}
@Overload
public float deposit( float unroundedInitialBalance, float unroundedFinalBalance){
    return unroundedInitialBalance + unroundedFinalBalance; //Demonstrating overloading
}
@Override
public double budget (int depositcount, double finalBalance) {
    if (depositcount == 0 ) {
    throw new ArithmeticException("Cannot divide by zero");
    }
    return finalBalance / depositcount;
   }
@Override
public void AccountInfo(){
    System.out.println("Advanced bank tips: Use deposit to access balance after depositing and withdraw to access balance after withdawal");

}
 }
