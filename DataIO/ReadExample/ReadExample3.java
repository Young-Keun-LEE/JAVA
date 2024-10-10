package DataIO.ReadExample;
import java.io.*;
public class ReadExample3 {
    public static void main(String[] args) {
        try{
            Reader reader = null;

            reader = new FileReader("D:\\justd\\JAVA\\DataIO\\WriteExample\\test.txt");
            while(true){
                int data = reader.read();
                if(data == -1) break;
                System.out.print((char)data);
            }
            reader.close();
            System.out.println();

            reader = new FileReader("D:\\justd\\JAVA\\DataIO\\writeExample\\test.txt");
            char[] data = new char[100];
            while(true){
                int num = reader.read(data);
                if(num == -1) break;
                for(int i = 0; i < num; i++){
                    System.out.print(data[i]);
            }
        }
        reader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
