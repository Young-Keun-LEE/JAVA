package Stream.StreamExample3;

import java.util.*;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("John" , 10),
            new Student("Danny" , 20),
            new Student("Jack" , 30)
        );

        double avg = list.stream().mapToInt(student -> student.getScore())
        .average()
        .getAsDouble();
        

        System.out.println("Average score: " + avg);
    }    
}
