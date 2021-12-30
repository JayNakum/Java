class Bank {
    int getInterest() {
        return 0;
    }
}

class BankA extends Bank {
    int getInterest() {
        return 5;
    }
}

class BankB extends Bank {
    int getInterest() {
        return 6;
    }
}

class BankC extends Bank {
    int getInterest() {
        return 7;
    }
}

public class P02Q10 {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        System.out.println("Interest provided by A: " + a.getInterest());
        System.out.println("Interest provided by B: " + b.getInterest());
        System.out.println("Interest provided by C: " + c.getInterest());
    }
}
