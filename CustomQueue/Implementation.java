package CustomQueue;

public class Implementation {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        System.out.println( queue.deque());
        System.out.println( queue.deque());
        System.out.println( queue.deque());
        System.out.println( queue.deque());
        System.out.println( queue.deque());
        System.out.println( queue.deque());
    }
}
