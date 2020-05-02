package collection1;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String args[]){
        LinkedHashSet<Integer> lhs=new LinkedHashSet();
        lhs.add(53);
        lhs.add(6323);
        lhs.add(6435);
        lhs.add(3525);
        lhs.add(57);
        lhs.forEach(System.out::println);

    }
}
