/**Filename: Book.java
 * @author: Mwiche Dina Nachilongo 202208650
 * @version: 1.0
 *Description: Base class used to demonstrate constructor chaining
 *To compile: javac Book.java
 *To execute: java Book
*/

package MyBookDetails;

public class Book { 
    protected String bookTitle;
    
    public Book(String bookTitle){
        this.bookTitle = bookTitle;
    }
public String getbookTitle(){
    return this.bookTitle;
}

public  String setbookTitle(){
    return this.bookTitle;
}

public void BookInfo(){
    System.out.println("The title of this book is, %s",bookTitle );
}
}