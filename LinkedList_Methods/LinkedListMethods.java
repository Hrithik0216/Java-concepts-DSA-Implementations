package LinkedList_Methods;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListMethods {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list.contains(4));
        list.addFirst(-1);
        list.addLast(5);

        System.out.println(list.toString());
        ListIterator<Integer> its = list.listIterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(int i: list){
            System.out.println(i);
        }

    }
}
