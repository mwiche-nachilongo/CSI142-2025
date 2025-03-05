/*/**Filename: Stationery.java
 * @author: Mwiche Dina Nachilongo 202208650
 * @version: 1.0
 * lab number: 297
 * Description: Sub-sub-class used  to illustrate constructor chaining
 * To compile: javac Stationery.java
 * To execute: java Stationery
 */ 

package StudentBelongings.contents;// Package statements

public class Stationery extends Book{//
    
    //define more specialized fields
    protected String stationeryItem;
   public Stationery (String stationeryItem){
        super(Book);//calls constructor of Book class




//@Override
super.bagInfo();
    }
}