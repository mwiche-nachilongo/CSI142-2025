/**Filename: Calculator.java
 * @author: Mwiche Nachilongo 202208650
 * @version: 1.0
 * Description: program to process the two integers prompted for
 * To compile:javac Calculator.java
 * To execute: java Calculator
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){}     
    
    // to add 
    public static int add ( int a, int b){
         a = a + b;
        return a; //if non-void
    }

    // to substract
    public static int substract (int a, int b){
         a = a- b;
        return a; //if non-void
    }

    //to multiply
public static int multiply(int a, int b){
     a = a * b;
    return a; //if non-void
}
//to divide 
public static int divide(int a, int b){
     a = a/b;
    return a; //if non-void
}
    

 public static void main (Scanner [] args){

   Scanner numberCalc = new Scanner (System.in);
   int a;
int b;
int result;

//data entry prompts
    System.out.printf("Enter integer a:\n");
    a= numberCalc.nextInt();

   System.out.printf("Enter integer b:\n");
   b= numberCalc.nextInt();

   //to call the method add 
   result = add(a,b);

   // to print the result 
   System.out.printf("The sum is %d", result);

   //to  call the method substract
   result= substract(a, b);

   //to print the result
   System.out.printf("The difference %d", result);

   //to call the method multiply
   result = multiply(a, b);

   //to print the result
   System.out.printf("The product is %d", result);

   //to call the method divide 
   result = divide (a,b);

   //to print the result
   System.out.printf("The quotient is %d", result);

   numberCalc.close();
}
}

