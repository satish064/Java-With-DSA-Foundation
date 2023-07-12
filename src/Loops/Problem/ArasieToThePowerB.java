package Loops.Problem;
import java.util.Scanner;
public class ArasieToThePowerB {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a raise to the power b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for(int i = 1;i<=2;i++)
        {
            ans*=a;
        }
        System.out.print("A rasie to the power B : "+ a);
    }
}
