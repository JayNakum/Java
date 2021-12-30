
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FThread extends Thread {
    String fname;

    FThread(String name) {
        fname = name;
    }

    public void run() {
        File f1 = new File("./one.txt");
        try {
            Scanner sc = new Scanner(f1);

            while (sc.hasNextLine()) {
                System.out.println(fname + ": " + sc.nextLine());
            }
        } catch (IOException i) {
            System.out.println("Output File not created");
        }
    }
}

class SThread extends Thread {
    String sname;

    SThread(String name) {
        sname = name;
    }

    public void run() {
        File f2 = new File("./second.txt");
        try {
            Scanner sc = new Scanner(f2);
            while (sc.hasNextLine()) {
                System.out.println(sname + ": " + sc.nextLine());
            }
        } catch (IOException i) {
            System.out.println("Output File not created");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            String s1 = "first";
            String s2 = "second";
            FThread f = new FThread(s1);
            SThread st = new SThread(s2);
            long l1 = s1.length();
            long l2 = s2.length();
            if (l1 > l2) {
                f.setPriority(Thread.MAX_PRIORITY);
                st.setPriority(Thread.MIN_PRIORITY);
            } else {
                st.setPriority(Thread.MAX_PRIORITY);
                f.setPriority(Thread.MIN_PRIORITY);
            }
            f.start();
            st.start();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}