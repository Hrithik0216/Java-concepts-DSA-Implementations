package MessageService.LooseCouple;

public class Execution {
    public static void main(String[] args) {
    ObjectA a = new ObjectA(8);
    ObjectB b = new ObjectB(0);
    int result = b.receiveMessage(a);
    System.out.println(result);
    }
}
