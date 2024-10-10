package DataIO.WriteExample;
import java.io.*;
public class writeExample1 {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("D:\\justd\\JAVA\\DataIO\\test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
