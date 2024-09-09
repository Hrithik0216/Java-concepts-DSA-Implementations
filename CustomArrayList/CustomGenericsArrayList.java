package CustomArrayList;

import java.util.Iterator;

public class CustomGenericsArrayList<T> implements Iterable<T> {
    T[] data;
    static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    @SuppressWarnings("unchecked")
    public CustomGenericsArrayList() {
        this.data = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T val) {
        if (isFull()) {
            resize();
        }
        ptr++;
        data[ptr] = val;
    }

    public T remove(int index) {
        if (index < 0 || index > ptr) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        T removed = data[index];
        for (int i = index; i < ptr; i++) {
            data[i] = data[i + 1];
        }
        ptr--;
        return removed;
    }

    public int size() {
        return ptr + 1;
    }

    public void set(int index, T val) {
        if (index < 0 || index > ptr) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        data[index] = val;
    }

    public T get(int index) {
        if (index < 0 || index > ptr) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    @SuppressWarnings("unchecked")
    public void resize() {
        T[] temp = (T[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index <= ptr;
            }

            @Override
            public T next() {
                return data[index++];
            }
        };
    }
}
