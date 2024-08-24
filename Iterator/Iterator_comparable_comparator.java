package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_comparable_comparator {
    public static void main(String[] args) {
        int a;
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        Iterator<Integer> integerIterator = list.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
        for(int i: list){
            System.out.println(i);
        }
    }
}
