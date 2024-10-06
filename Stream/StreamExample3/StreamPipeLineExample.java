package Stream.StreamExample3;

import java.util.*;
import java.util.stream.*;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("홍길동" , 10),
            new Student("신용권" , 20),
            new Student("유미선", 30)
        );

        Stream<Student> studentStream = list.stream();
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        double avg1 = scoreStream.average().getAsDouble();

        double avg2 = list.stream().mapToInt(stduent -> stduent.getScore()).average().getAsDouble();
        System.out.println("평균점수: " + avg2);

        
    }    
}
