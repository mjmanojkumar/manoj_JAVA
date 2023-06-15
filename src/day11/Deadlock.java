package day11;

public class Deadlock {

    public static void main(String[] args) {
        // Create two shared resources
        Object resource1 = new Object();
        Object resource2 = new Object();

        // Create and start the first thread
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 acquired resource 1");

                try {
                    // Introduce some delay to allow the second thread to acquire resource 2
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1 acquired resource 2");
                }
            }
        });

        // Create and start the second thread
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 acquired resource 2");

                synchronized (resource1) {
                    System.out.println("Thread 2 acquired resource 1");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

