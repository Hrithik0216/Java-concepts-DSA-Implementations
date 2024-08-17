package MultiThreading;

public class Thread5 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Thread 5 is running: "+i);
        }
    }
}
