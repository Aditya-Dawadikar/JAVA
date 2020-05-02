package collection1;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> al= new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(3,99);
        for (Integer integer : al) {
            System.out.println(integer);
        }

        System.out.println(al.get(3));
    }
}
