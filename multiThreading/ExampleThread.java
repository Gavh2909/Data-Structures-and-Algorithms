package multiThreading;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExampleThread extends Thread {
    public static void main(String[] args) {
        ExampleThread t1 = new ExampleThread();
        t1.start();
        // t1.start();
        ExampleThread t2 = new ExampleThread();
        t2.start();

         ExecutorService service = Executors.newFixedThreadPool(3);
         
         /*
         * Thread Pool concept: Executor framework
         * 
         */
    }
    public void run() {
        // compute primes larger than minPrime
         System.out.println("Thread is running");
    }
}