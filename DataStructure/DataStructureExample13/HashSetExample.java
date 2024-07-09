package DataStructure.DataStructureExample13;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "이영근"));
        set.add(new Student(1, "조민우"));

        System.out.println("저장된 객체 수: " + set.size());

        for(Student student : set) {
            System.out.println("학번 : " + student.studentNum + ", 이름 : " + student.name);
        }
    }
}
