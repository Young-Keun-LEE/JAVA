package ThreadExample5;

public class PrintThread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("실행중");
                Thread.sleep(1);
            }
        }catch(InterruptedException e){

        }
        System.out.println("리소스 정리");
        System.out.println("실행종료");
    }
}
