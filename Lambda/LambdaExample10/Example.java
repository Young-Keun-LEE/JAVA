package Lambda.LambdaExample10;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("Clicked Ok button"));
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Clicked Cancel button"));
        btnCancel.click();
    }
}
