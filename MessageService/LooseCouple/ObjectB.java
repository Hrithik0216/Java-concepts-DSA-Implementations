package MessageService.LooseCouple;

public class ObjectB{
    private int val;
    public ObjectB(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }

    public int receiveMessage(ObjectA a){
        return a.getVal();
    }

}
