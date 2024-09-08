package CustomLinkedList;

public class Execute {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(55);
        list.addFirst(65);
        list.addFirst(57);
        list.addFirst(55);
        list.addFirst(57);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.insert(56,2);
        list.display();
    }
}
