package DataStructure.DataStructureExample11;

import java.util.*;
public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
    
        treeSet.add(new Fruit("grape", 3000));
        treeSet.add(new Fruit("watermelon", 10000));
        treeSet.add(new Fruit("strawberry", 6000));

        for(Fruit fruit : treeSet){
            System.out.println(fruit.name + ": " + fruit.price);
        }
    }
}
