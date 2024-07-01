import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        int n;
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the number");
        n=shubham.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            };
            if(count==2){
                System.out.println("This is prime number");
            }

        }





    }
}
