class Thread1 implements Runnable
{
    @Override
    public void run() {
        int x = 0;
        while (x!=10) {
            System.out.println("1 is running");
            x++;
        }
    }
}
class Thread2 implements Runnable
{
    @Override
    public void run() {
        int x = 0;
        while (x!=10) {
            System.out.println("2 is running");
            x++;
        }
    }
}

public class P03Q13 {
    public static void main(String[] args) {
        Thread1 c1 = new Thread1();
        Thread t1 = new Thread(c1);
        t1.setName("Thread 1");

        Thread2 c2 = new Thread2();
        Thread t2 = new Thread(c2);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}