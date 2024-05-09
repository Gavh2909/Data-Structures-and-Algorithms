# Threading in Java:

## 1. Introduction to multi threading.
- Multithreading is a programming concept that allows concurrent execution of two or more parts of a program to maximize the utilization of CPU time.
- In Java, multithreading is particularly powerful because it allows developers to write programs that can perform multiple tasks.
- **Main Thread:** Every Java program starts with a single thread called the `main thread`. This main thread is created by the Java Virtual Machine(JVM) and is responsible for executing the `main()` method of the program.

## 2. Process, Thread, Multasking, Multithreading, MultiProcessing:

### 2.1. Process:
- A process is an instance of a running program. It is an independent entity in the system, with its own memory space and resources.
- Each process has its own address space, code, data, and system resources such as open files and network connections.
- Processes are managed by operating system, which allocates resources, schedules their execution, and provides inter-process communication mechanisms.

### 2.2. Thread:
- A thread is the smallest unit of execution within a process. It represents an independent flow of control.
- Threads within the same process share the same memory space and resources, including code, data, and file descriptors.
- Threads allow for concurrent execution of tasks within a single process, enabling parallelism and multitasking.

### 2.3. Multitasking:
- Multitasking is the ability of an operating system to run multiple processes concurrently.
- It allows multiple programs to run simultaneously, with each program seemingly executing at the same time.
- Modern operating systems use scheduling algorithms to allocate CPU time to different processes, switching between them rapidly to give the illusion og parallel execution.

### 2.4. Multiprocessing:
- Multiprocessing refers to the use of multiple processors or CPU cores to execute multiple processes simultaneously.
- Each process runs independently on its own CPU core, allowing for tru parallelism.
- Multiprocessing can significantly improve system performance by distributing the workload across multiple processors.
- It is commonly used in high-performance computing, servers, and systems requiring heavy computational tasks.

In summary, processes are independent instances of running programs, threads are independent units of execution within processes, multitasking enables concurrent execution of multiple processes, multithreading enables concurrent execution of multiple threads within a process, and multiprocessing involves using multiple processors to execute multiple processes simultaneously.

## 3. Creating and Starting Thread in Java
In Java, there are two main ways to create and start a thread:

### 1. Extending the `Thread` class:
- You can create a new class that ectends the `Thread` class and override its `run()` method to define the code that will be executed by the thread.

### 2. Implementing the `Runnable` interface:
- Alternatively, ypu can create a class that implements the `Runnable` interface and pass an instance of this class to a `Thread` object.
- This approach seperates the thread's behaviur from the thread's execution, which can be useful when you want to use inheritance for other purposes.

```java
package multiThreading;

import java.lang.Thread;

public class MyThread extends Thread {
    public void run() {
        // Define the code to be executed bt the Thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running:" + i);

            try {
                // Adding some delay for demonstration
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }

    // Inplementing the `Runnable` interface:
    public static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread running:" + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted");
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // start the thread
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
```

## 4. Life cycle of Thread
## 5. Thread Operations, getting name, sleeping:
## 6. Daemon Thread
## 7. Producer and Consumer problem:    