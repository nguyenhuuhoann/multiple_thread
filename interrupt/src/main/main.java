package main;

public class main {
    public static void main(String[] args) {

        Thread thread =  new Thread(new BookingTask());
        thread.start();
        thread.interrupt();
    }
    private static class BookingTask implements Runnable{
        @Override
        public void run(){
            try{
                System.out.println("ok");
                Thread.sleep(500000);
            }catch (InterruptedException e){
                System.out.println("Exiting ");
            }
        }
    }
}
