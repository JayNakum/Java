class SyncThread {
	public synchronized void print() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

class FirstThread implements Runnable {
	SyncThread s;
	FirstThread(SyncThread s) {
		this.s = s;
	}
	public void run() {
		s.print();
	}
}

class SecondThread extends Thread {
	SyncThread s;
	SecondThread(SyncThread s) {
		this.s = s;
	}
	public void run() {
		s.print();
	}
}

public class P5_7 {
	public static void main(String[] args){
		SyncThread s = new SyncThread();

		FirstThread t1 = new FirstThread(s);
		SecondThread t2 = new SecondThread(s);
	
		Thread tr1 = new Thread(t1);
		Thread tr2 = new Thread(t2);
	
		tr1.start();
		tr2.start();
	}
}