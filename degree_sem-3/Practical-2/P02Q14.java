interface ParentA {
    void add(int a, int b);
}
interface ParentB {
    void subtract(int a, int b);
}

public class P02Q14 implements ParentA, ParentB{
    @Override
    public void add(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }
    @Override
    public void subtract(int a, int b) {
        System.out.println("a - b = " + (a - b));
    }
    public static void main(String[] args) {
        P02Q14 obj = new P02Q14();
        obj.add(10, 20);
        obj.subtract(20, 10);
    }
}
