package DataIO.WriteExample;
import java.io.*;
public class writeExample4 {
    public static void main(String[] args) {
        try{
            Writer writer = new FileWriter("D:\\justd\\JAVA\\DataIO\\WriteExample\\test.txt");

            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            char[] arr = {'C' , 'D' , 'E'};
            writer.write(arr);

            writer.write("FGH");
            writer.flush();

            writer.close();
        }catch(IOException e){
            e.printStackTrace();
    }
}
}
