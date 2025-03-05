/**Filename: Bag.java
 * @author: Mwiche Dina Nachilongo 202208650
 * @version: 1.0
 * lab number: 297
 * Description: Base class used  to illustrate constructor chaining
 * To compile: javac Bag.java
 * To execute: java Bag
 */
package com.StudentBelongings.Bags; //Package statement

public class Bag{
    //define fields
    protected String brandname;
    protected double price;
    protected String contents;
    
    public Bag (String brandname, double price, String contents)
         {
        this.brandname = brandname;
        this.price = price;
        this.contents= contents;
        System.out.println("The brand of this bag is:" + brandname);
    }
    
// create method for overriding  
public void bagInfo(){ 
    System.out.println("***BAG INFO***");
    System.out.println("Brandname: %s\n Price:%f\n Contents:%s\n", brandname,price,contents);

}
}
