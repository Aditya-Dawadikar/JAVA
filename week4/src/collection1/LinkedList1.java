package collection1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String args[]){
        LinkedList<Integer>l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        for(Integer i:l){
            System.out.println(i);
        }
        ListIterator<Integer> li=(ListIterator<Integer>)l.iterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
