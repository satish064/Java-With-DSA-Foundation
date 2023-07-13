package Loops.Problem.Pattern;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class TranangularPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

    }


}
