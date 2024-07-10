package Lambda.LambdaExample4;

public class Person {
    public void action1(Workable workable){
        workable.work("John", "Software engineer");
    }

    public void action2(Speakable speakable){
        speakable.speak("Hello!");
    }
    
}