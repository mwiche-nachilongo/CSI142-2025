/**********************************************
 * Filename: ConsoleApp.java
 * @author: Mwiche Dina Nachilongo 202208650 
 * @version 1.0
 * Description: Program to 
 * To compile: javac ConsoleApp.java
 * To execute: java ConsoleApp
 */

import java.util.Scanner;

public class ConsoleApp{
    public static void main (String [] args) {
        args[0]= ("teacher");
        if(args.legnth > 0){
            System.out.println("First arg:" + args [0]);
        }
        System.out.println("Teacher mode enabled");

        Scanner kb = new Scanner (System.in);

        int score;
        String item;
        String name;
        String terminate;
        int average;
        int sum = 0;
        String [] options;
        int count;

        //input prompts
        
        System.out.println("***MENU***");
        do {
            String [] options = new String [4];

            System.out.println("Enter score:");
            String [0]= kb.nextInt();
            score++;

            System.out.println("Enter item:");
            String[1]= kb.nextLine();

            System.out.println("Enter name:");
            String[2]= kb.nextLine();

            System.out.println ("Enter exit to terminate:  ");
            String[3]= kb.nextLine();
}
while (!(String[3]).equals(terminate));

    // to implement the calculate average option compile as follows: javac consoleApp teacher

if (args[0].equalsIgnoreCase("teacher")){

System.out.println("***MENU***");
    do {
    String [] options = new String [5];

     System.out.println("Enter score:");
     String [0]= kb.nextInt();

     System.out.println("Enter item:");
     String[1]= kb.nextLine();
     count++;

     System.out.println("Enter name:");
     String[2]= kb.nextLine();

     System.out.println("Enter average to display average:");
     sum = sum + score;
      average = (sum / count);
     String [3]= average;
      
     System.out.println ("Enter exit to terminate:");
     String[4]= kb.nextLine();
    }
while (!String[3].equalsIgnoreCase(terminate));
   
}
kb.close();
}
}