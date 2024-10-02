package MessageService.TightCoupling;

public class ObjectB {
    private int val;
    public ObjectB(int val) {
        this.val= val;
    }

    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }

    public int receiveMessage(int val){
        return this.val +10;
    }
}
