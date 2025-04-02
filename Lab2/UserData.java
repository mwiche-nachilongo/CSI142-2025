/**Filename: UserData
* @author: Mwiche Dina Nachilongo 202208650.
@version: 1.0
Description: Program to implement a fixed array
To compile:javac UserData.java
To execute: java UserData
 */
import java.util.Scanner;

public class UserData {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);

        String [] names = new String [3]; // To create fixed array 
        System.out.println("Enter exactly three names:"); //To prompt the user for exactly 3 names

         names [0] = in.nextLine();
         names [1] = in.nextLine();
         names [2]= in.nextLine();

        //To print all collected  data
        System.out.println("Names in ascending order");
         System.out.println(names[0], names[1], names[2]);
        System.out.println("Names in descending order");
        System.out.println(names[2], names[1], names[0]);

    }
}

         



        






    



