package DataIO.WriteExample;
import java.io.*;
public class writeExample3 {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("D:\\justd\\JAVA\\DataIO\\test3.db");
            byte[] array = {10, 20 , 30, 40, 50};

            os.write(array,1,3);
            os.flush();
            os.close();
        }catch(IOException e){
            e.printStackTrace();
    }
}
}