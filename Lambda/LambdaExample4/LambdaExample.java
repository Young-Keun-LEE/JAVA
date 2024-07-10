package Lambda.LambdaExample4;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name,job) -> {
            System.out.println(name + " is " + job);
        });

        person.action1((name,job) -> {
            System.out.println(name + " is not " + job);
        });

        person.action2(word -> {
            System.out.println("Speak: " + word);
        });

        person.action2(word -> {
            System.out.println("Anounce: " + word);
        });
    }
}
