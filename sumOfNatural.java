import java.util.Scanner;

public class sumOfNatural {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner shubham=new Scanner(System.in);
        n=shubham.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
