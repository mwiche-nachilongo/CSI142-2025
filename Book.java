/**Filename: Book
 * @author: Mwiche Dina Nachilongo 202208650
 * @version: 1.0
 * Program to: Display creation of book class
 * To compile: javac Book.java
 */


public class Book{
    public String title;
    public String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}