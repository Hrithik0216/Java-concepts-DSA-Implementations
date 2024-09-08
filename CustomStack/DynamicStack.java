package CustomStack;

public class DynamicStack extends CustomStack {
    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int item) throws StackCustomException {
        if (this.isFull()) {
            int[] temp = new int[this.data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            this.data = temp;
        }
        super.push(item);
    }
}
