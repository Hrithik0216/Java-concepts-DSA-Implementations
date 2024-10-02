package MessageService.LooseCouple;

import MessageService.TightCoupling.ObjectB;

import java.util.Random;

public class ObjectA implements MessageService{
    Random ran = new Random();
    private int val;
    public ObjectA(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public int sendMessage() {
        return this.val;
    }
}
