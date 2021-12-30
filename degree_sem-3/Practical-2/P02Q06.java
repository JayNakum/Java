class Que6 {
    static int add(int[] args) {
        int sum = 0;
        for(int i = 0 ; i < args.length ; i ++) {
            sum += args[i];
        }
        return sum;
    }
}

public class P02Q06 {
    public static void main(String[] args) {
        int[] operands = {1, 2, 3, 4, 5};
        System.out.println(Que6.add(operands));
    }
}
