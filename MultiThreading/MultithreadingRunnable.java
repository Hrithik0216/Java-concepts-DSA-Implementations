package MultiThreading;

public class MultithreadingRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Multithreading name is "+Thread.currentThread().getName());
        for(int i=0;i<100;i++){
            System.out.println("This is from child: "+i);
        }
    }
}
