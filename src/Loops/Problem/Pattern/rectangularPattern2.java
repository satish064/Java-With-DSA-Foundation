package Loops.Problem.Pattern;
import java.util.Scanner;
public class rectangularPattern2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column : ");
        int r = sc.nextInt(),c = sc.nextInt();
        for(int i = 1;i<=r;i++)
        {
            for(int j = 1;j<=c;j++)
            {
                if(j==1 || i == 1 || j == c || i == r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


}
