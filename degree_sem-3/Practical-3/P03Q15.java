import java.util.LinkedList;

public class P03Q15 {

    public static void main(String[] args)
            throws InterruptedException
    {
        final ProducerAndConsumer pAndC = new ProducerAndConsumer();

        // Creating producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pAndC.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Creating consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pAndC.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Starting both threads
        t1.start();
        t2.start();

        //t1 is Producer and t2 is consumer so t1 finishes before t2
        t1.join();
        t2.join();
    }

    public static class ProducerAndConsumer {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        public void produce() throws InterruptedException
        {
            int value = 0;
            while (value!=10) {
                synchronized (this)
                {
                    while (list.size() == capacity)
                        wait();

                    System.out.println("Producer produced:" + value);
                    list.add(value++);
                    // notifies the consumer thread that now it can start consuming
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        // Function called by consumer thread
        public void consume() throws InterruptedException
        {
            while (true) {
                synchronized (this)
                {
                    // consumer thread waits while list is empty
                    while (list.size() == 0)
                        wait();

                    // to retrieve the if first job in the list
                    int val = list.removeFirst();

                    System.out.println("Consumer consumed: " + val);
                    // Wake up producer thread
                    notify();
                    // and sleep
                    Thread.sleep(1000);
                }
            }
        }
    }
}
