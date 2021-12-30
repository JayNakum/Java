class A {
    A() {
        System.out.println("I am the parent!");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("I am the child!");
    }
}

public class P02Q03 {
    public static void main(String[] args) {
        new B();
    }
}
