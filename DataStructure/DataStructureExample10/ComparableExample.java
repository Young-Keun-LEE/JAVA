package DataStructure.DataStructureExample10;

import java.util.*;
public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("이영근", 25));
        treeSet.add(new Person("김성준", 31));

        for(Person person : treeSet) {
            System.out.println(person.name + ": " + person.age);
        }
    }
}
