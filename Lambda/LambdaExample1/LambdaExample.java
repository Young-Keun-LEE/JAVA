package Lambda.LambdaExample1;

public class LambdaExample {
    public static void main(String[] args) {
    action((x,y) -> {
        int result = x + y;
        System.out.println("Result: " + result);
    });

    action((x,y) -> {
        int result = x - y;
        System.out.println("Result: " + result);
    });
}
     
    public static void action(Calculable calculable){
        int x = 10;
        int y = 4;

        calculable.calculate(x, y);
    }
}