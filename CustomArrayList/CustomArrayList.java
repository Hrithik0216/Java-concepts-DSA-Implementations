package CustomArrayList;

public class CustomArrayList {
    int[] data;
    static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int val) {
        if (isFull()) {
            resize();
        }
        ptr++;
        data[ptr] = val;
    }

    public int remove(int index) {
        if (index < 0 || index > ptr) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        for (int i = index; i < ptr; i++) {
            data[i] = data[i + 1];
        }
        ptr--;
        return data[index];
    }

    public int size() {
        return ptr + 1;
    }

    public void set(int index, int val) {
        if (index < 0 || index > ptr) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        data[index] = val;
    }

    public int get(int index) {
        if (index < 0 || index > ptr) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

}
