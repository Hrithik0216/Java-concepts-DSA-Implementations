package MultiThreading;

public class Thread2 implements Runnable {
    private static final Object lock = new Object(); // Shared lock object
    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 30; i++) {
                if(i==20){
                    throw new RuntimeException();
                }
                System.out.println("Thread 2 is running: "+i);
            }
        }
    }
}
