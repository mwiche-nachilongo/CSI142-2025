
/**Filename: InvalidInputException
 * @version: 1.0
 * @author: Mwiche Dina Nachilongo 202208650
 * Program to: attempts an operation requiring valid user input
 * To compile: javac InvalidInputException.java
 */
import java.util.Scanner;

public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
    super(message);
    }
   
   public static int readAndParse() throws InvalidInputException {

    Scanner BalanceReader = new Scanner(System.in);
    int integer;
    String input;
   
    System.out.print("Enter an integer: ");
   
    input = BalanceReader.nextLine();//Read string from user input
   
    try {
    
     input.readandParse(integer); //try converting input to int
   
    } catch (NumberFormatException e) {
    throw new InvalidInputException("Not a valid integer: " + input);//Throws input exception
}
    } public void Finally() {
    System.out.println("Finally block: always runs!");//Run a print statement
   } 
   public static void main(String[] args) {
    try {
    int value = readAndParse(); //try parse
    System.out.println("Parsed int: " + value);
    } catch (InvalidInputException e) {
    System.out.println("Error: " + e.getMessage()); //Catch exception in main
    }
}}
   
   
   