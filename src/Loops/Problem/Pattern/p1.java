package Loops.Problem.Pattern;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(i==j || ((i+j) == (n+1)))
                {
                    System.out.printf("*");
                }
                else
                    System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
