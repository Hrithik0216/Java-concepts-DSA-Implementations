package MultiThreading;

public class ExecutionClass {
    public static void main(String[] args) {
        // Create instances for the class that implements Runnable
        Thread1 r1 = new Thread1(); // Keep a reference to Thread1 to access the custom methods
        // This line creates an instance of the Thread1 class and stores it in a variable r1 of type Thread1.
        Runnable r2 = new Thread2();
        // This line creates an instance of the Thread2 class and stores it in a variable r2 of type Runnable.
        Runnable r3 = new Thread3();
        Runnable r4 = new Thread4();
        Runnable r5 = new Thread5();

        // Create Thread instances
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        Thread t5 = new Thread(r5);


        r1.sayName("Hrithik"); // Call sayName on the Thread1 instance
        // Start the threads
        t1.start();
        try {
            t1.join(); // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.setPriority(Thread.MAX_PRIORITY); // Not reliable. All tasks are executed concurrently

        for (int i = 0; i < 10; i++) {
            System.out.println("This is from parent: " + i);
        }
    }
}
