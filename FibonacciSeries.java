import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int prev=0;
        int next=1;
        int num; 
        System.out.print(prev + " ");
        for (int i = 1; i < n; i++) {
            num=prev+next;
            prev=next;
            next=num;
            System.out.print(num +" ");
        }
    }
}