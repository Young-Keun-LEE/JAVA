package DataIO.IOStream;
import java.io.*;
import java.util.*;

public class Copy {
    public static void main(String[] args) throws Exception{
        File OriginPath = null;
        File DestinationPath = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("원본 파일 경로: ");
        OriginPath = new File(scan.nextLine());
        System.out.print("복사 파일 경로: ");
        DestinationPath = new File(scan.nextLine());
        
        if (!OriginPath.exists()) {
            System.out.println("원본파일이 존재하지 않습니다.");
            return;
        }

        if (!DestinationPath.getParentFile().exists()) {
            DestinationPath.getParentFile().mkdirs();
        }

        if (!DestinationPath.exists()) {
            DestinationPath.createNewFile();
        }

        try (FileInputStream fis = new FileInputStream(OriginPath);
             FileOutputStream fos = new FileOutputStream(DestinationPath)) {
            
            byte[] buffer = new byte[1024]; // 1KB 크기의 버퍼 생성
            int length;
            
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("파일이 성공적으로 복사되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
