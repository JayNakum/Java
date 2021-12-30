import java.io.File;
import java.util.Scanner;

class MyThread1 implements Runnable {
    String str;
    static int length;

    public MyThread1() {
    }

    public MyThread1(String s) {
        str = s;
    }

    @Override
    public void run() {
        int i = 0;
        StringBuilder data = new StringBuilder();
        try {
            File f1 = new File(str);
            Scanner reader = new Scanner(f1);
            while (reader.hasNextLine()) {
                i++;
                String tempData = reader.nextLine() + " ";
                data.append(tempData);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        length = data.length();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println(data);
    }
}

class MyThread2 implements Runnable {
    String str;

    public MyThread2() {
    }

    public MyThread2(String s) {
        str = s;
    }

    @Override
    public void run() {
        int i = 0;
        StringBuilder data = new StringBuilder();
        try {
            File f1 = new File(str);
            Scanner reader = new Scanner(f1);
            while (reader.hasNextLine()) {
                i++;
                String tempData = reader.nextLine() + " ";
                data.append(tempData);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyThread1 m1 = new MyThread1();
        if (MyThread1.length > data.length()) {

            Thread t1 = new Thread(m1);
            t1.setPriority(10);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        } else {
            MyThread2 m2 = new MyThread2();
            Thread t2 = new Thread(m2);
            t2.setPriority(10);
        }
        System.out.println(data);
    }
}

public class Practical2 {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1("./one.txt");
        Thread t1 = new Thread(obj1);
        MyThread2 obj2 = new MyThread2("./two.txt");
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
