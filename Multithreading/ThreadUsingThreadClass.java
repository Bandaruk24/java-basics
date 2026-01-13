package Multithreading;

// Thread class is used to create a thread by extending it and
// overriding the run() method, while start() creates a new execution path
public class ThreadUsingThreadClass extends Thread{
    // run() - Contains thread logic
    // Calling run() directly will NOT create a new thread
    public void run(){
        for(int i=0 ; i <= 5 ; i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
    public static void main(String[] args) {
        // Thread using Thread class
        ThreadUsingThreadClass t1 = new ThreadUsingThreadClass();
        ThreadUsingThreadClass t2 = new ThreadUsingThreadClass();

        // start() - Creates new thread and calls run() internally
        t1.start();
        t2.start();
    }
}
