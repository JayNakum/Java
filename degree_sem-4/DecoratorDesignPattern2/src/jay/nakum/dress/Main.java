package jay.nakum.dress;

interface Dress {
    public void design();
}

class MyBeautifulDress implements Dress {
    @Override
    public void design() {
        System.out.println("Designing my dress");
    }
}

abstract class DressDecorator implements Dress {
    protected Dress decoratedDress;

    public DressDecorator(Dress decoratedDress) {
        this.decoratedDress = decoratedDress;
    }

    public void design() {
        decoratedDress.design();
    }
}

class FormalDressDecorator extends DressDecorator {
    public FormalDressDecorator(Dress decoratedDress) {
        super(decoratedDress);
    }

    @Override
    public void design() {
        decoratedDress.design();
        decorate();
    }

    private void decorate() {
        System.out.println("Design: Formal");
    }
}

class CasualDressDecorator extends DressDecorator {
    public CasualDressDecorator(Dress decoratedDress) {
        super(decoratedDress);
    }

    @Override
    public void design() {
        decoratedDress.design();
        decorate();
    }

    private void decorate() {
        System.out.println("Design: Casual");
    }
}

class SportsDressDecorator extends DressDecorator {
    public SportsDressDecorator(Dress decoratedDress) {
        super(decoratedDress);
    }

    @Override
    public void design() {
        decoratedDress.design();
        decorate();
    }

    private void decorate() {
        System.out.println("Design: Sports");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Dress dress = new MyBeautifulDress();
        System.out.println("\nDress without decoration");
        dress.design();

        Dress formalDress = new FormalDressDecorator(new MyBeautifulDress());
        System.out.println("\nFormal Dress");
        formalDress.design();

        Dress sportsCasualDress = new SportsDressDecorator(new CasualDressDecorator(new MyBeautifulDress()));
        System.out.println("\nSporty casual dress");
        sportsCasualDress.design();

    }
}
