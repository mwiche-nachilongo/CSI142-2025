/**Filename: BookList
 * @author: Mwiche Dina Nachilonog 202208650
 * @version: 1.0
 * Program to: Display creation of singly linked list and removeFirst method
 * To compile: javac BookList.java
  */
import java.util.Stack;

public class MyStackLL<T> {
    private Node <T> head;
    public MyStackLL() {
    head = null;
    }
    public static void main (String[] args) {

        Order o1 = new Order("456COFFEE", 20.00);
        Order o2 = new Order("567RUSK", 25.95);
        Order o3 = new Order("098SCONE", 18.95);

        MyStackLL myStackLL = new MyStackLL();
        myStackLL.push();
        
 }


 public Node <T> removeFirst() {
    if (head.equals(null)) {
    head = head.next;
}
return null;
}

public void push() {
    Node <T>  bookNode = new Node<>();
    bookNode.next = head;
    head = bookNode;
}

public Node <T> pop() {
    if (head == null) {
    System.out.println("Stack empty!");
    return null;
    }
    return head;
}

    public Node <T> peek() {
    if (head == null){
    return null;
    }
    return head;
}
}
    

    