class Que8 {
    private int a, b;
    Que8() {
        this(10, 20);
    }
    Que8(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int add() {
        return (a + b);
    }
}

public class P02Q08 {
    public static void main(String[] args) {
        System.out.println(new Que8().add());
        System.out.println(new Que8(40, 50).add());
    }
}
