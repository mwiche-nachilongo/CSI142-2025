/**Filename: Product
 * @author: Mwiche Nachilongo 202208650
 * @version: 1.0
 * Description: program to display the fields of the Product class
 * To compile:javac Product.java
 * To execute: java Product
*/

public class Product{
    private String name;
    private String sku;
    private double price;
    private int stockLevel;
    private String result;

public Product (String name, String sku, double price, int stockLevel){
    this.name = name;
    this.sku= sku;
    this.price= price;
    this.stockLevel = stockLevel;
}
public void displayProduct( ) {
    System.out.println("The product name:" + name + "and it costs," + price);
}
}