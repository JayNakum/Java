package one;

public class Q15a {
    public Q15a() {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        System.out.println("Interest provided by A: " + a.getInterest());
        System.out.println("Interest provided by B: " + b.getInterest());
        System.out.println("Interest provided by C: " + c.getInterest());
    }
}
