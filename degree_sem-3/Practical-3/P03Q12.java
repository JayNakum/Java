class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1");
    }
}
class ThreadB extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 2");
        int j=0;
        while (j!=5)
        {
            System.out.println("I am a thread from ThreadB");
            try {
                //this run method will run once and then will sleep for 2 second and if there is other thread is going on that will continue running then again                   run....
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            j++;
        }
    }
}

public class P03Q12 {
    public static void main(String[] args) {
        ThreadA tA = new ThreadA();
        ThreadB tB = new ThreadB();
        tA.start();
        tB.start();
        tA.setName("Thread A");
        System.out.println(tA.getName());
    }
}
