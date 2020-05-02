package collection1;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String args[]){
        HashSet<Integer> hs=new HashSet<>();

        hs.add(1);
        hs.add(98);
        hs.add(2);
        hs.add(576);
        hs.add(4);

        hs.forEach(System.out::println);
    }
}
