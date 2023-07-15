package Loops.Problem.Pattern;
import java.util.Scanner;
public class pulsPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a odd: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i == (n/2)|| j == (n/2))
                    System.out.printf("*");
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
