/**Filename: IDsorter
@version: 1.0;
@author: Mwiche Dina Nachilongo 202208650
Program to: Display creation of selection sort and linear search algorithm/methods
To compile: javac IDsorter.java
*/

package Lab9;

public class IDsorter{
    public static void selectionSorter (int [] studentIDs){
        for (int i = 0; i< studentIDs.length -1; i++){ // pick position i 
            int minIndex= i;

            // Scan sub-array to find global minimum
            for (int a = i + 1; a < studentIDs.length ; a++){
                do{
                  minIndex = studentIDs [a];
                }
                    while (( a < studentIDs.length) &&(studentIDs [a] < studentIDs [i]));
            // Swap places that min at index i
            int temp = studentIDs [a];
            studentIDs[a] = studentIDs [i];
            studentIDs [i] = temp;

            }
        }
    }


public static int linearSearch (int [] studentIDs, int target){
    for (int i= 0; i< studentIDs.length; i++){
        if(studentIDs [i]== target){
            return i; //found
        }
    }
    return -1; //not found


}
}

