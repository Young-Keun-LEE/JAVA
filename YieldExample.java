public class YieldExample {

    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");
        workThreadA.start();
        workThreadB.start();

        try{Thread.sleep(5000);}catch(InterruptedException e){} //main 스레드 5초 정지
        workThreadA.work = false;

        try{Thread.sleep(10000);}catch(InterruptedException e){} //main 스레드 10초 정지
        workThreadA.work = true;
    }
}