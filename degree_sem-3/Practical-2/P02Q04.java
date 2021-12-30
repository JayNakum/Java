class Que4 {
	private String msg;

	Que4() {
		this.msg = "Default message";
	}

	Que4(String msg) {
		this.msg = msg;
	}

	Que4(Que4 obj) {
		this.msg = obj.msg;
	}

	void print() {
		System.out.println(this.msg);
	}
}

public class P02Q04 {
	public static void main(String[] args) {
		Que4 obj1 = new Que4();
		obj1.print();
		Que4 obj2 = new Que4("Hello World!");
		obj2.print();
		Que4 obj3 = new Que4(obj2);
		obj3.print();
	}
}
