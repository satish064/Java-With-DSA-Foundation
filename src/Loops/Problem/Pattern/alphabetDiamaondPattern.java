package Loops.Problem.Pattern;
import java.util.Scanner;
public class alphabetDiamaondPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            char ch = 'A';
            for(int j = i;j<n;j++)
                System.out.printf(" ");
            for(int k = 1;k<=2*i-1;k++)
                System.out.print(""+ ch++);
            System.out.println();
        }
        for(int i = 1;i<n;i++)
        {
            char chh = 'A';
            for(int j = 1;j<=i;j++)
                System.out.printf(" ");
            for(int k = 1;k<=n-i;k++)
                System.out.printf(""+ chh++);
            for(int l = 1;l<=n-i-1;l++)
                System.out.printf(""+ chh++);
            System.out.println();
        }
    }
}
