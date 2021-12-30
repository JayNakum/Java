class GrandParent {
    protected int a = 50;
}

class Parent extends GrandParent {
    protected int b = 10;
    void add() {
        System.out.println(a + b);
    }
}

class Child1 extends Parent {
    protected int c = 30;
    void add() {
        System.out.println(a + b + c);
    }
}

class Child2 extends Parent {
    protected int d = 30;
    void subtract() {
        System.out.println(a - b - d);
    }
}

public class P02Q09 {
    public static void main(String[] args) {
        new Parent().add();
        new Child1().add();
        new Child2().subtract();
    }
}
