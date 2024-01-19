import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter first number: ");
        int n1=sc.nextInt();
        
        System.out.print("Enter Second number: ");
        int n2=sc.nextInt();

        

        int smallOne=Math.min(n1, n2);
        int result=1;
        for (int i = 1; i <= smallOne; i++) {
            if (n1%i==0 && n2%i==0) {
                if (i>=result) {
                    result=i;
                }
            }
        }
         System.out.println("GCD is: "+result);
        sc.close();
    }
}
