public class P2_2 {
    public static void main(String[] args) {
        int i;
        //int n = (int)args[0];
        int n = Integer.parseInt(args[0]);  

        for(i = 2; i < n; i++){
            if((n%i) == 0){
                break;
            }
        }
        if(i==n){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is a non-prime number");
        }
    }
}
