package CustomQueue;

public class CustomQueue {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) front = rear = newNode;
        else rear.next = newNode; rear=newNode;
    }
    public int deque(){
        if(front ==null){
            throw new NullPointerException("front is null");
        }
        int temp =front.data;
        front = front.next;
        return temp;
    }
}
