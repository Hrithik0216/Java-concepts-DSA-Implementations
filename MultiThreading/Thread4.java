package MultiThreading;

public class Thread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Thread 4 is running: "+i);
        }
    }
}
