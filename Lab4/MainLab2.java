/**Filename: MainLab2
 * @author: Mwiche Nachilongo 202208650
 * @version: 1.0
 * Description: program to test the class Product (with objects created)
 * To compile:javac MainLab2.java
 * To execute: java MainLab2
*/

public class MainLab2 {

    public static void main (String [] args) {

           Product p1 = new Product ("fanta", "47", 9.00, 8);
           Product p2 = new Product ("Sprite","55", 8.00, 7);
           Product p3 = new Product("Kiwijuice","45", 7.00,6);  //mulitple objects created

           MainLab2.displayProduct(); // call method display product
    
     }

    public double setPrice (double price){
        this.price = price;
        return price;  //create setter
    }

    public int getStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
        return stockLevel;  //create getter
    }
}
   