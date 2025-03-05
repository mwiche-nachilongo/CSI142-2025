/**Filename: Book.java
 * @author: Mwiche Dina Nachilongo 202208650
 * @version: 1.0
 * lab number: 297
 * Description: Sub-class used  to illustrate constructor chaining
 * To compile: javac Book.java
 * To execute: java Book
 */
package com.StudentBelongings.Contents; //package statement

public class Book extends Bag {
    //define more specialized fields
    protected String ownerName;
    protected String rangeString; //new object to extend final subclass Stationery


    public Book(String ownerName){
        super(Bag); //calls constructor of Bag class
        this.ownerName = ownerName;
    }

        public class BookContents {
            protected int firstpageNumber;
            protected int lastpageNumber;
        }

            public BookContents (firstpageNumber, lastpageNumber) {
                super(Bag)
            this.firstpageNumber = firstpageNumber;
            this.lastpageNumber = lastpageNumber;
            }

            public int getfirstpageNumber(){
                return this.firstpageNumber;
            }

            public int getlastpageNumber(){
                return this.lastpageNumber;
            }

            public void displayRange (firstpageNumber lastpageNumber){
                System.out.println("The book starts on page %d and ends on page %d", firstpageNumber, lastpageNumber);
            }
        
 //@Override
        super.bagInfo();
}
    



