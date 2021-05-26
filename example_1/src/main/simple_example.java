package main;

public class simple_example {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are in thread: " + Thread.currentThread().getName());
                System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
            }
        });

        // Create thread with lambda
        Thread thread_2 = new Thread(() -> {
            System.out.println("We are in thread: " + Thread.currentThread().getName());
            System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
        });

        // set name for thread
        thread_2.setName("lambda thread");
        // set priority for thread max = 10, min = 1, normal = 5
        thread_2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before we starting a new thread");
        thread_2.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after we starting a new thread");
        Thread.sleep(10000);
    }
}
