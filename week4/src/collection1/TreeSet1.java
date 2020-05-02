package collection1;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String args[]){
        TreeSet<String> ts= new TreeSet<>();
        ts.add("1");
        ts.add("*");
        ts.add("A");
        ts.add("a");

        ts.forEach(System.out::println);
    }
}
