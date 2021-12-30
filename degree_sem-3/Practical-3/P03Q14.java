class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i!=10){
        System.out.println("Thread with maximum priority");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread with minimum priority");
    }
}

class Thread3 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i!=10){
            System.out.println("Thread without priority");
            i++;
        }
    }
}

public class P03Q14 {
    public static void main(String[] args) {
        Thread1 t1  = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
