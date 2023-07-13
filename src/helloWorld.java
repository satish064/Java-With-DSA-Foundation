
import java.util.Scanner;
public class helloWorld

{
    public static void main(String[] args)
    {
        // 123 321
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter b number :  ");
        int sum = sc.nextInt(),ans = 1;
        for(int i = 1;i<=sum;i++)
        {
           ans *= num;
        }
        System.out.println(ans);
    }
}