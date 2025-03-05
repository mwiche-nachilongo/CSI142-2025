/**Filename: CmdArgDemo.java
* @author: Mwiche Dina Nachilongo 202208650.
@version: 1.0
Description: Program to demostrate command line arguments without prompting the user.
To compile:javac CmdArgDemo Hello
To execute: java CmdArgDemo
 */

public class CmdArgDemo {
    public static void main (String []args ) {
    Scanner in = new Scanner (System.in);
    
    if (args.legnth == 0) {
        System.out.println("No arguments provided");
        }
        if (args.length > 0 ) {
            System.out.println ( "args[0]" );
            
        }
    }
}