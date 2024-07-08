package ThreadStudy.ThreadExample5;

public class PrintThread extends Thread{
    public void run(){

            while(true){
                System.out.println("실행중");
                if(Thread.interrupted()){
                    break;
                }
            }
            System.out.println("리소스 정리");
            System.out.println("실행종료");
        }

    }

