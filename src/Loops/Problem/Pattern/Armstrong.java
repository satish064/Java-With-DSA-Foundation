package Loops.Problem.Pattern;
import java.util.Scanner;
public class Armstrong {
    static int cube(int n)
    {
        int cube = n*n*n;
        return cube;
    }
    static int digitSum(int n)
    {
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            sum += cube(digit);
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++)
        {
            if(digitSum(i) == i)
                System.out.println(i);
        }
    }
}
