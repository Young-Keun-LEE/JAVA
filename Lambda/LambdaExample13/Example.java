package Lambda.LambdaExample13;

public class Example {
    
    private static Student[] students = {
    new Student("Danny", 90, 96),
    new Student("Einstein", 95, 93)
    };

    public static double avg(Function<Student> function){
        double sum = 0;
        for(Student student : students){
            sum += function.apply(student);
        }
        return sum / students.length;
    }
    public static void main(String[] args){
        //double englishAvg = avg( s -> s.getEnglishScore() );
        double englishAvg = avg(Student :: getEnglishScore);
        System.out.println("English avg score: " + englishAvg);

        //double mathAvg = avg( s -> s.getMathScore() );
        double mathAvg = avg(Student :: getMathScore);
        System.out.println("Math avg score: " + mathAvg);

        
    }
}
