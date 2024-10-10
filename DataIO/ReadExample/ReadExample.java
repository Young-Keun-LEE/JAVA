package DataIO.ReadExample;
import java.io.*;
public class ReadExample {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("D:\\justd\\JAVA\\DataIO\\WriteExample\\test1.db");

            while(true){
                int data = is.read();
                if(data == -1)break;
                System.out.println(data);
        }
        is.close();
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }

}
}
