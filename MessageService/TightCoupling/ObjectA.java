package MessageService.TightCoupling;

public class ObjectA {
    private int val;
    public ObjectA(int val) {
        this.val= val;
    }

    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }

    public int sendMessageToB(){
        ObjectB ob = new ObjectB(val);
        int result = ob.receiveMessage(val);
        return result;
    }
}
