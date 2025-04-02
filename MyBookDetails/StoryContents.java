/**Filename: StoryContents.java
 * @author: Mwiche Dina Nachilongo 202208650
 * @version: 1.0
 *Description: sub-sub class used to demonstrate constructor chaining
 *To compile: javac StoryContents.java
 *To execute: java StoryContents
*/

package MyBookDetails;

public class StoryContents extends result {
    super (Book);
    protected String paragraph;
    protected 
}
    public StoryContents (String paragraph){
    this.paragraph =paragraph;
    }

    public String getparagraph(){
        return this.paragraph;
    }

    public String setparagraph(){
        return this.paragraph;
    }
public void BookInfo(){ 
    System.out.println("The story contains %d characters including empty spaces",paragraph.legnth());
}

