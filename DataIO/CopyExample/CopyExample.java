package DataIO.CopyExample;
import java.io.*;
public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "D:\\justd\\JAVA\\DataIO\\CopyExample\\test.png";
        String targetFileName = "D:\\justd\\JAVA\\DataIO\\CopyExample\\test2.png";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data = new byte[1024];
        while(true){
            int num = is.read(data);
            if(num == -1)break;
            os.write(data, 0, num);
        }
        os.flush();
        os.close();
        is.close();
        System.out.println("복사가 완료되었습니다");
   }
}
