package Practical_List_3;

class myThread extends Thread {
    @Override
    public void run() {
        System.out.println("It's the method which will run when we will start a thread with start() method");
        System.out.println("Thread 1");
    }
}
class myThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 2");
        int j=0;
        while (j!=5)
        {
            System.out.println("I am a thread from myThread2");
            try {
                //this run method will run for 1 time and then will sleep for 2 second and if there is other thread is going on that will continue running then again                   run....
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            j++;
        }
    }
}

public class Que_12 {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();
        //to start a thread
        t1.start();
        t2.start();
        //to give name to a thread
        t1.setName("My thread number 1");
        //to know the name of a particular thread
        System.out.println(t1.getName());
    }
}
