/**Filename: DoWhileSentinel
 * @author: Mwiche Nachilongo
 * @version: 1.0
 * Description: program to implement do-while (Expense tracker)
 * To compile:javac DoWhileSentnel.java
 * To execute: java DoWhileSentinel
*/

import java.util.Scanner;

public class DoWhileSentinel {
    public static void main (String [] args) {
        
        Scanner in = new Scanner (System.in);
        double expense;
        int count = 0;
        double total = 0;
         
        do{ 
            System.out.println("Enter expense:"); // To prompt user
           expense = in.nextDouble();
           count++;
        total = expense + total ;
        }while (expense > 0);

        System.out.println("The total of the expenses entered is" + expense);
    }
}
