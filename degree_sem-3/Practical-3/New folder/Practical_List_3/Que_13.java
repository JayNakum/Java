package Practical_List_3;
//The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Runnable interface have only one method named run().
class class1 implements Runnable
{
    @Override
    public void run() {
        int x = 0;
        while (x!=45) {
            System.out.println("I am running 1");
            x++;
        }
    }
}
class class2 implements Runnable
{
    @Override
    public void run() {
        int x = 0;
        while (x!=45) {
            System.out.println("I am running 2");
            x++;
        }
    }
}

public class Que_13 {
    public static void main(String[] args) {
        class1 c1 = new class1();
        Thread t1 = new Thread(c1);
        t1.setName("Thread of class1");

        class2 c2 = new class2();
        Thread t2 = new Thread(c2);
        t2.setName("Thread of class2");

        t1.start();
        t2.start();
    }
}
