package Loops.Problem.Pattern;
import java.util.Scanner;
public class pattern {
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++)
        {
            for(int j = num - i;j>=1;j--)
                System.out.printf(" ");
            for(int k = 1 ;k<=2*i-1;k++)
                System.out.printf("*");
            System.out.println();
            }
    }
}
