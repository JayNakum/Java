interface Test {
	static Test test(Test t) {
		return (t + t);
	}
	static int add(int a, int b) {
		return (a + b);
	}
}

public class InterfaceDemo implements Test{
	public static void main(String[] args) {
		int ans = Test.add(2, 2);
		System.out.println(ans);
		Test t = Test.test(Test.add(2, 2));
	}
}