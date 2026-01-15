package Multithreading;

// Steps to Create Thread Using Runnable
// Create a class that implements Runnable
// Override the run() method
// Create a Thread object
// Pass Runnable object to Thread
// Call start()
class ThreadUsingRunnable implements Runnable{
    public void run(){
     for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
    } 
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadUsingRunnable());
        Thread t2 = new Thread(new ThreadUsingRunnable());
        // t.start(); // New thread created
        t1.start();
        t2.start();
    }

    // Why is Runnable preferred? => Supports multiple inheritance & better design
    // Can we call start() on Runnable? => No, start() belongs to Thread
    // Can one Runnable be used by multiple threads? => Yes
    // Can Runnable return value? => No (use Callable)
}
