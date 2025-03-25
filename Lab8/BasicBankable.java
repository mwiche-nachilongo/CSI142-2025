/**Filename:  BasicBankable
 * @version: 1.0
 * @author: Mwiche Dina Nachilongo 202208650
 * Program to: demonstrate interface implementation
 * To compile: javac BasicBankable.java
 */

 public class BasicBankable implements Bankable{
    protected double initialBalance;
    protected double finalBalance;
    protected float unroundedInitialBalance;
    protected float unroundedFinalBalance;

    public BasicBankable (double initialBalance, double finalBalance, float unroundedInitialBalance, float unroundedFinalBalance){
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
        this.unroundedFinalBalance = unroundedFinalBalance;
        this.unroundedInitialBalance= unroundedFinalBalance;

    @Override
    public double deposit (double initialBalance, double finalBalance){
        return initialBalance + finalBalance; //Demonstrating overriding
    }
    @Override
public double withdraw (double initialBalance, double finalBalance){
    return finalBalance - initialBalance;// Demonstrating overriding
}
@Overload
public float deposit( float unroundedInitialBalance, float unroundedFinalBalance){
    return unroundedInitialBalance + unroundedFinalBalance; //Demonstrating overloading

    }

 }

