package Multithreading;

class SharedResource{
    private int data;
    private boolean available=false;
    // Why do we use synchronized ?
    // Thread locks the SharedResource object
    // Only one thread can enter at a time
    // Other thread waits for the lock
    synchronized void produce(int value){
        while(available){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        data=value;
        available=true;
        System.out.println("Produced: "+data);

        // notify consumer
        notify();
    }

    synchronized int consume(int value){
        while(!available){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        available=false;
        System.out.println("Consumed: "+data);
        // notify producer
        notify();
        return data;
    }
}

class Producer extends Thread{
    SharedResource resource;
    //Constructor method receives the SharedResource object from main()
    // and assigns it to the Producer’s internal variable.
    Producer(SharedResource resource){
        // lock is used here
        this.resource=resource;
    }

    public void run(){
        for(int i=0;i<=5;i++){
            resource.produce(i);
        }
    }
}

class Consumer extends Thread{
    SharedResource resource;

    Consumer(SharedResource resource){
        this.resource=resource;
    }

    public void run(){
        for(int i=0;i<=5;i++){
            resource.consume(i);
        }
    }
}

class IntInterThreadCommunicationDemo{
    public static void main(String[] args) {
        // Creating a sharedResource object.
        SharedResource resource = new SharedResource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}