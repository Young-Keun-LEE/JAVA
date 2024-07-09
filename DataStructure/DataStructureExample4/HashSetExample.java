package DataStructure.DataStructureExample4;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        
        System.out.println("총 객체 수 : " + set.size());

    }    
}
