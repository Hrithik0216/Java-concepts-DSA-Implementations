package CustomArrayList;

import java.util.Iterator;

public class Execution {
    public static void main(String[] args) {
        CustomGenericsArrayList <String> list = new CustomGenericsArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        for(String s: list){
            System.out.println(s);
        }
        Iterator<String> it;
        it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
