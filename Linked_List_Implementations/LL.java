package Linked_List_Implementations;

public class LL {
    Node head;
    Node tail;
    int size;


    //Logic
    //1. Sets the node's next pointer to the head
    //2. updates the head with new node
    //Note: We are not swapping. We are assigning
    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    //Logic
    //1. Sets the Tail's next pointer to the new node
    //2. updates the tail with node
    //Note: We are not swapping. We are assigning
    public void addLast(int val){
        if(tail==null){
            addFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insert(int val, int index){
        if(index ==0){
            addFirst(val);
        }
        if(index ==size){
            addLast(val);
        }

        Node temp = head;
        //understand why i starts from 1
        for(int i=1; i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size+=1;
    }

    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+ " -> ");
            temp=temp.next;
        }
        System.out.println(" END");
    }

    private class Node {
        int val;
        Node next;

        private Node(int val) {
            this.val = val;
        }

        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}