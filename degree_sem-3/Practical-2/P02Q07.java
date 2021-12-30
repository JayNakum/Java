public class P02Q07 {
    public int x;
    P02Q07() {
        x = 1;
    }
    int passByValue(int x) {
        System.out.println("x = " + x);
        return (x + 1);
    }
    P02Q07 passByReference(P02Q07 obj) {
        obj.x += 1;
        return obj;
    }
    public static void main(String[] args) {
        P02Q07 obj = new P02Q07();
        System.out.println("Pass by value:");
        System.out.println("x = " + obj.passByValue(obj.x));        
        System.out.println("Pass by reference:");
        System.out.println("x = " + obj.passByReference(obj).x);
    }
}
