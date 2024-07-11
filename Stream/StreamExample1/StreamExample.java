package Stream.StreamExample1;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args){

        Set<String> set = new HashSet<String>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
