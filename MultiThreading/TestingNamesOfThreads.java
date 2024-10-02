package MultiThreading;

public class TestingNamesOfThreads {
    public static void Hello1(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void Hello2(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(()-> {
            try{
                Thread.sleep(1000);
                Hello1();
            }catch (Exception e){
                e.printStackTrace();
            }

        } );
        t1.setPriority(2);
        t1.setName("Hello 1");
        t1.start();

        Thread t2 = new Thread(()->Hello2());
        t2.setPriority(1);
        t2.setName("Hello 2");
        t2.start();
    }
}
//Thread priority might not impact the order of execution significantly,
// as thread scheduling depends on the underlying operating system.