class Que5 {
    private int privateValue;
    public int publicValue;
    final private int finalValue = 304;

    Que5(int privateValue) {
        this.privateValue = privateValue;
        // finalValue = 31; // Not Possible because the variable is final
    }

    public void changeVariable(int value) {
        value += 10;
    }

    public void changeObject(Que5 object) {
        object.publicValue += 10;
    }

    public void print() {
        System.out.println("privateValue = " + privateValue);
        System.out.println("publicValue = " + publicValue);
        System.out.println("finalValue = " + finalValue);
    }
}

public class P02Q05 {
    public static void main(String[] args) {
        Que5 obj = new Que5(10);
        // obj.privateValue = 10; // Not possible because the variable is private
        obj.publicValue = 20; // This is possible because the variable is public
        obj.print();

        int value = 40;
        obj.changeVariable(value); // This will pass value of the variable
        System.out.println(value); // therefore this will print 40 only

        obj.changeObject(obj); // This will pass the reference of the object
        System.out.println(obj.publicValue); // therefore this will print updated value 30 i.e. 20 + 10
    }
}
