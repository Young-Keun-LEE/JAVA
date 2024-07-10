package Lambda.LambdaExample12;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int MaxorMin(Operator operator){
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
    }
    return result;
}

    public static void main(String[] args) {
        int max = MaxorMin(Integer :: max);
        System.out.println("Max: " + max);

        int min = MaxorMin(Integer :: min);
        System.out.println("Min: " + min);
    }
}