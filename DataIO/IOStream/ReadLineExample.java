package DataIO.IOStream;
import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("D:\\justd\\JAVA\\DataIO\\IOStream\\ReadLineExample.java"));

        int lineNo =1;
        while(true){
            String str = br.readLine();
            if(str == null) break;
            System.out.println(lineNo++ + "\t" + str);
        }
        br.close();
    }    
}
