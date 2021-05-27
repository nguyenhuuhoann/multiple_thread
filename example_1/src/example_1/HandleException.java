package example_1;

public class HandleException {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
           throw  new RuntimeException("Intentional Exception");
        });

        thread.setName("Misbehaving thread");

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error happened in thread: "+t.getName() +"  the error is: "+ e.getMessage());
            }
        });
        thread.start();
    }
}
