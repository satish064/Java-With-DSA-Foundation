package Loops.Problem.Pattern;
import java.util.Scanner;
public class newp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                if((j + i) % 2 == 0)
                    System.out.printf("1");
                else
                    System.out.printf("0");
            }
            System.out.println();
        }
    }
}
