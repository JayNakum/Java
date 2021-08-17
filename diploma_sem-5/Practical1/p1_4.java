public class p1_4{
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for (k=5;k>i;k--){
                System.out.print("  ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j + " ");
            }
            for(j=2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}