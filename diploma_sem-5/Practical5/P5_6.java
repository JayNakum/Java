class MyException extends Exception {
	MyException() {
		System.out.println("Invalid Number");
	}
}

public class P5_6 {
	public void compute(int x) throws MyException {
		if(x > 30) {
			throw new MyException();
		}
		else {
			System.out.println("k");
		}
	}
	public static void main(String[] args) {
		P5_6 obj = new P5_6();
		try{
			obj.compute(60);
		}
		catch(MyException me) {
			System.out.println(me);
		}
	}
}