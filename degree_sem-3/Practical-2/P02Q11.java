class Banks {
    int getInterest() {
        return 0;
    }
}

class BankA extends Banks {
    int getInterest() {
        return 5;
    }
}

class BankB extends Banks {
    int getInterest() {
        return 6;
    }
}

class BankC extends Banks {
    int getInterest() {
        return 7;
    }
}

public class P02Q11 {
    public static void main(String[] args) {
        Banks bank = new BankA();
        System.out.println("Interest provided by A: " + bank.getInterest());
        bank = new BankB();
        System.out.println("Interest provided by B: " + bank.getInterest());
        bank = new BankC();
        System.out.println("Interest provided by C: " + bank.getInterest());
    }
}
