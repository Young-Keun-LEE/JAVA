package DataStructure.DataStructureExample14;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);    
    
    String name = null;
    int maxScore = 0;
    int totalScore = 0;

    Set<Map.Entry<String, Integer>> set = map.entrySet();

    for(Map.Entry<String, Integer> o : set){
        if(maxScore < o.getValue()){
            maxScore = o.getValue();
            name = o.getKey();
        }
        totalScore += o.getValue();
    }

    System.out.println("Average Score: " + totalScore/map.size());
    System.out.println("Highest person: " + name + ", Score: " + maxScore);

}
}
