package MultiThreading;

public class Thread3 implements Runnable {
    @Override
    public void run(){
        for(int i=0; i<30; i++){
            System.out.println("Thread 3 is running: "+ i);
        }
    }
    public void run(String name){
        for(int i=0; i<2; i++){
            System.out.println("Thread 3 run with overloaded value: "+ name);
        }
    }

    public void start(){
        System.out.println("Thread 3 is starting");
    }
}
