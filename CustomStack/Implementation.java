package CustomStack;

public class Implementation {
    public static void main(String[] args) throws StackCustomException {
        CustomStack cs = new DynamicStack(5);
        cs.push(4);
        cs.push(3);
        cs.push(2);
        cs.push(1);
        cs.push(0);

        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());



    }
}
