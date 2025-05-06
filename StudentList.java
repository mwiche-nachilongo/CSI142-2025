/**Filename: StudentList
 * @version: 1.0
 * @author : Mwiche Dina Nachilongo 202208650
 * Program to: Display creation of student list with head pointer
 * To compile: javac StudentList.java
 */


public class StudentList <T> {
private Node<T> head;
 public StudentList() {
 head = null; 
 }

// add student method to append new student at the end 
 public void add (Student s) {
 Node<T> newNode = new Node<>();
 if (head == null) {
 head = newNode;
 } else {
 Node<T> student = head;
 while (student.next != null) {
 student = student.next;
 }
 student.next = newNode;
 }
 }
 // print all method to display all student details
 public void printAll() {
 Node<T> student = head; 
while (student != null) {
 System.out.print(student + "->");
 student = student.next;
}
 System.out.println("null");
}
}

