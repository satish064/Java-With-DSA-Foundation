package Loops.Problem;
import java.util.Scanner;
public class SumOfSeries {
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int ans = 0;
        for(int i = 1;i<=num;i++)
        {
            if(i % 2 == 0)
                ans-=i;
            else
                ans+=i;
        }

        System.out.println("The sum of the series is = "+ ans);
    }
}
