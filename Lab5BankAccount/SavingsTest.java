public class SavingsTest {
    public static void main(String[] args) {
    SavingsAccount sav1 = new SavingsAccount("SAV2001", 1000.0, 2.5);
    sav1.applyInterest();
    sav1.withdraw(100);
    System.out.println("Final balance: p" + sav1.getBalance());
    }
}   