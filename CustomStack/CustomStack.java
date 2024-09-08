package CustomStack;

public class CustomStack {
    int[] data;
    private int pointer = -1;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
     }

    public void push(int item) throws StackCustomException {
        if (isFull()) {
            throw new StackCustomException("Stack is full");
        }
        pointer++;
        data[pointer] = item;
    }

    public int pop()throws StackCustomException {
        if (isEmpty()) {
            throw new StackCustomException("Stack is empty");
        }
        int removed = data[pointer];
        pointer--;
        return removed;
    }
    public int peek()throws StackCustomException {
        if (isEmpty()) {
            throw new StackCustomException("Stack is empty");
        }
        return data[pointer];
    }

    boolean isFull() {
        return pointer == data.length - 1;
    }

    private boolean isEmpty() {
        return pointer == -1;
    }

}
