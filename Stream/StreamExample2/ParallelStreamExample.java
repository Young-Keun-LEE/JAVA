package Stream.StreamExample2;

import java.util.*;
import java.util.stream.*;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Desert");
        list.add("Elderberry");

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(name -> {
            System.out.println(name + ": " + Thread.currentThread().getName());
        });
    }    
}
