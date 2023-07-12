package Loops.Problem.Pattern;
import java.util.Scanner;
public class rectangularPattern {
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and column : ");
        int row = sc.nextInt() , colunm = sc.nextInt();
        for(int i = 1;i<=row;i++)
        {
            for(int j = 1;j<=colunm;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

