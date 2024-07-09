package DataStructure.DataStructureExample9;

import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores =  new TreeSet<Integer>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for(Integer s : scores) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래 점수: " + scores.lower(95));
        System.out.println("95점 바로 위의 점수: " + scores.higher(95));

        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for(Integer score : descendingScores){
            System.out.print(score + " ");
        }
        System.out.println("\n");

        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for(Integer score : rangeSet){
            System.out.print(score + " ");
        }
        System.out.println("\n");

        rangeSet = scores.subSet(80, true, 90 ,false);
        for(Integer score : rangeSet){
            System.out.print(score + " ");
        }


}
}
