/**Filename: Student
 * @version 1.0
 * @author Mwiche Dina Nachilongo 202208650
 * Program to: Display creation of student class
 * To compile: javac Student.java
 */

public class Student {
    public String name;
    public double score;

    public Student (String name, double score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
    
}