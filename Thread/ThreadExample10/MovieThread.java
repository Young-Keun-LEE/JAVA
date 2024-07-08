package Thread.ThreadExample10;

public class MovieThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("동영상을 재생합니다.");
            if(isInterrupted()){
                break;
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행종료");
    }
}
