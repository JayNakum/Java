package p3;
import java.util.*;
class p10{
    float fund;
    void deposit(float amount){
        fund=amount;
    }
    void withdraw(float money) throws Exception{
        float newFund=fund-money;
        if(newFund<500){
            throw new Exception("Not Sufficient Fund");
        }
        else{
            fund=newFund;
            System.out.println("Balance After Withdraw : "+fund);
        }
    }
        public static void main(String arg[]){
            p10 b=new p10();
            b.deposit(1000.00f);
            try{
                float money;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Your Amount for withdraw : ");
                money=sc.nextInt();
                System.out.println("Withdrawing amount : "+money);
                b.withdraw(money);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
}