package DataIO.WriteExample;
import java.io.*;
public class writeExample2 {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("D:\\justd\\JAVA\\DataIO\\test2.db");
            byte[] array = {10 ,20 ,30};

            os.write(array);
            os.flush();
            os.close();
        }catch(IOException e) {
            e.printStackTrace();
    }
}
}
