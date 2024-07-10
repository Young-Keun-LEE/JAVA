package DataStructure.DataStructureExample15;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
    TreeSet<Student> treeSet = new TreeSet<Student>();
    treeSet.add(new Student("blue", 96));
    treeSet.add(new Student("hong", 86));
    treeSet.add(new Student("white", 92));
    
    Student student = treeSet.last();
    System.out.println("Best score: " + student.score);
    System.out.println("Best score Id: " + student.id);
}
}
