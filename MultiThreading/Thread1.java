package MultiThreading;

public class Thread1 implements Runnable {
    private String name = "Hrithik";

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Thread 1 is running: "+i);
        }
    }

    //Inside a methods wrap it by creating an object for thread class to run that method in a separate thread.
    public void sayName(String name) {
        new Thread(() -> {
            System.out.println(name + " is running");
        }).start();
    }
}
