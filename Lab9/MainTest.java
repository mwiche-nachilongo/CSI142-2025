/**Filename: MainTest
@version: 1.0;
@author: Mwiche Dina Nachilongo 202208650
Program to: Implement creation of selection sort algorithm
To compile: javac MainTest.java
To execute: java SorterArray IDsorter MainTest */

package Lab9;


public class MainTest{
    public static void main ( String [] args){

int [] studentIDs = new int [5]; // Declare array of 5 integers
        studentIDs [0] = 0;
        studentIDs[1] = 8;
        studentIDs [2] = 6;
        studentIDs [3] = 5;
        studentIDs [4] = 0;

//compute difference between maximum and mininmum values
      int difference =   studentIDs [4] - studentIDs [0];
// print original array
System.out.println("Original array: " +MainTest.toString(studentIDs));


//print sorted array
IDsorter.idSorter(studentIDs);
System.out.println("Sorted array:" +MainTest.toString(studentIDs));

//print difference
System.out.println("The difference computed is" +difference);
      
    }
}