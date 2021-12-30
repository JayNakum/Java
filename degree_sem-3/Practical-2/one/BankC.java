package one;

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

public class BankC extends Bank {
    protected int getInterest() {
        return 7;
    }
}