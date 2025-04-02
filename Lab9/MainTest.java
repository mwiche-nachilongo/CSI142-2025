/**Filename: MainTest
@version: 1.0;
@author: Mwiche Dina Nachilongo 202208650
Program to: Implement linear search and selection sort algorithm
To compile: javac MainTest.java
To execute: java IDsorter MainTest */

package Lab9;

import java.util.ArrayList;

public class MainTest{
    public static void main ( String [] args){

int [] studentIDs = new int [5]; // Declare array of 5 integers
        studentIDs [0] = 0;
        studentIDs[1] = 8;
        studentIDs [2] = 6;
        studentIDs [3] = 5;
        studentIDs [4] = 0;

//instatiate class objects

SelectionSort l1 = new SelectionSort("Paje", 38);
SelectionSort l2 = new SelectionSort("Maun", 40);
SelectionSort l3 = new SelectionSort("Palapye", 35);
SelectionSort l4= new SelectionSort("Francistown", 29);
SelectionSort l5 = new SelectionSort("Kanye", 19);

//store in arraylist
public ArrayList <int> temperatureRecord = new ArrayList<>();
temperatureRecord.add(38);
temperatureRecord.add(40);
temperatureRecord.add(35);
temperatureRecord.add(29);
temperatureRecord.add(19);

//compute difference between maximum and mininmum values
      int difference =   studentIDs [4] - studentIDs [0];
// print original array
System.out.println("Original array: " + Arrays.toString(studentIDs));

//print sorted array
 IDsorter.selectionSorter(studentIDs);
System.out.println("Sorted array:" + Arrays.toString(studentIDs));

//print difference
System.out.println("The difference computed is" +difference);

//print last digit of id
int index = IDsorter.linearSearch(studentIDs, 0);
System.out.println("The index of the last digit of the ID is" +index);

//print temperature records
IDsorter.selectionSorter(temperatureRecord);
System.out.println("The sorted temperatures are" +Arrays.toString(temperatureRecord));

    }
}