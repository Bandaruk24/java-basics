package Multithreading;

import javax.print.attribute.standard.MediaSize.Other;
// NEW → RUNNABLE → RUNNING → WAITING → RUNNABLE → TERMINATED
class ThreadLifecycleDemo extends Thread{
    //Thread is executing run() method
        public void run(){
            try{
                System.out.println("Thread state inside run(): "+Thread.currentThread().getState());

                Thread.sleep(1000);
                //hread pauses for a fixed time
                // Other methods:
                // wait()
                // join()
                System.out.println("Thread woke up and running again");
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        public static void main(String[] args) throws InterruptedException{
            ThreadLifecycleDemo t =new ThreadLifecycleDemo();
            //Thread object created but not started

            //New State

            System.out.println("After Creation: "+t.getState());

            // Runnable State
            t.start();
            //Thread is ready to run
            // JVM decides when it runs
            System.out.println("After start(): "+t.getState());

            // Main Thread sleeps to allows child thread to sleep
            Thread.sleep(100);

            //TIMED_WAITING state
            System.out.println("During sleep(): "+t.getState());

            // wait for thread to finish
            t.join();

            //Terminated State
            System.out.println("After Completion: "+t.getState());
        }
}
