/**Filename: Loop.java
 * @author: Mwiche Nachilongo 202208650
 * @version: 1.0
 * Description: program to ask for and sum up scores
 * To compile:Loop.java
 * To execute: java Loop

 */
import java.util.Scanner;

public class Loop{
    public static void main(String[] args) {
        Scanner intreader = new Scanner (System.in);

        int scorecount = 0;
        int sentinel = -1;
        int N = intreader.nextInt();
        int sum = 0; 


 
while(N != sentinel){
    System.out.printf("Enter integer score:");
       sum = N + sum;
       scorecount++;
    }
System.out.printf("Number of scores entered: %d\n", scorecount);
System.out.printf( "Sum of scores: %d\n", sum);

}
}