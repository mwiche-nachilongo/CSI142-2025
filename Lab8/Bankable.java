/**Filename:  Bankable
 * @version: 1.0
 * @author: Mwiche Dina Nachilongo 202208650
 * Program to: demonstrate interface creation
 * To compile: javac Bankable.java
 */

 public interface Bankable{
    void bank(); //create interface

    default void AccountInfo(){
        System.out.println("Basic bankable usage: deposit(), withdraw()..."); //default method
        }
    }



    


 

 


 
