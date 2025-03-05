/**Filename: Greeting.java
 * @author: Mwiche Nachilongo
 * @version: 1.0
 * Description: program to output a custom greeting
 * To compile:javac Greeting.java
 * To execute: java Greeting

 */

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String name;

        System.out.printf("Enter your name:");
        name = in.nextLine(); // using Scanner

        System.out.println("Hello,"+ name + "!Welcome to 142.");

    }
}