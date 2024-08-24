package Functional_Interfaces;


@FunctionalInterface
interface A {
//    void show();
    int add(int i, int j);
}


public class Functional_interface {
    public static void main(String[] args) {
        //Instantiate using an anonymous class
//        A a = new A()
//        {
//            public void show(){
//                System.out.println("Hello World");
//            }
//        };
        A a = (int i, int j) ->  i+j;
        System.out.println(a.add(1,2));

    }
}
