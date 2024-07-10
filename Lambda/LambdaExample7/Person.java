public class Person {
    public void ordering(Comparable comparable){
        String a = "Danny";
        String b = "Jobs";

        int result = comparable.compare(a, b);

        if(result < 0){
            System.out.println(a + " comes before " + b);
        }
        
        else if (result > 0){
            System.out.println(a + " comes after " + b);
        }

        else{
            System.out.println(a + " and " + b + " are the same");
        }

    }
}
