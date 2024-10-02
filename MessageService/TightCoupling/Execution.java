package MessageService.TightCoupling;

public class Execution {
    public static void main(String[] args) {
        ObjectA oa= new ObjectA(55);
        int result= oa.sendMessageToB();
        System.out.println(result);
    }
}
