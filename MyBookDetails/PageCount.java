/**Filename: PageCount.java
 * @author: Mwiche Dina Nachilongo 202208650
 * @version: 1.0
 *Description: sub-class used to demonstrate constructor chaining
 *To compile: javac PageCount.java
 *To execute: java PageCount
*/
package MyBookDetails;

public class PageCount extends bookTitle {
    super(Book);
    protected int firstpageNumber;
    protected int lastpageNumber;
    protected int result;
    
public PageCount (int firstpageNumber, int lastpageNumber, int result) {
        this.firstpageNumber= firstpageNumber;
        this.lastpageNumber = lastpageNumber;
        this.result= result;

    }
    public int getfirstpageNumber(){
        return this.firstpageNumber;
    }

    public int setfirstpageNumber(){
        return this.fisrtpageNumber;
    }

    public int getlastpageNumber(){
        return this.lastpageNumber;
    }

    public int setlastpageNumber(){
        return this.lastpageNumber;
    }

    public static int PageCountProcessor(int firstpageNumber, int lastpageNumber, int result){ 
        result = lastpageNumber - firstpageNumber;
        return result;
    }

    public void PageCountInfo(){
        System.out.println("The number of pages excluding the title page is %d", PageCount.PageCountProcessor (firstpageNumber, lastpageNumber, result));
    }
}
