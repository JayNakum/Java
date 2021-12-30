package Practical_List_3;

class user extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i!=10){
        System.out.println("Creating user");
            i++;
        }
    }
}

class thread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i!=10){
            System.out.println("I am thread without priority");
            i++;
        }
    }
}

class background extends Thread {
    @Override
    public void run() {
        System.out.println("Getting ready to serve data to user");
    }
}

public class Que_14 {
    public static void main(String[] args) {
        user me  = new user();
        background data = new background();
        thread t1 = new thread();

        //Which thread have max priority it will start first others will later
        me.setPriority(Thread.MAX_PRIORITY);
        data.setPriority(Thread.MIN_PRIORITY);

        me.start();
        data.start();
        t1.start();
    }
}
