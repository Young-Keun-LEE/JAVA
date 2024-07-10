package Lambda.LambdaExample2;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(() -> {
            System.out.println("go to work");
            System.out.println("do coding");
        } );

        person.action(() -> {
            System.out.println("go home");
        });
    }
}
