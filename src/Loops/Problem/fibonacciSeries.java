package Loops.Problem;
import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int n1=1,n2=1;
        if(num > 2)
        {
            System.out.printf("1 1 ");
            for(int i = 3 ; i<=num;i++)
            {
                int sum = n1 + n2;
                n1 = n2;
                n2 = sum;
                System.out.printf(sum + " ");
            }
        }
        else  if(num == 1)
            System.out.printf("1");
        else
            System.out.printf("1 1");
    }
}
