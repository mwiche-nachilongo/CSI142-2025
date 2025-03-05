import java.util.Scanner;
public class DoWhileSentinel{
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        
        double expense;
        int count = 0;
        int sentinel = -1;
        double total = 0;
         
        do{ 
            System.out.println("Enter expense:");
           expense = in.nextDouble();
           count++;
        total += expense;
        }while (expense > 0);
    }
}