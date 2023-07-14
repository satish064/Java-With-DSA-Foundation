package Loops.Problem.Pattern;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int fac = sc.nextInt(),pro = 1;
        for(int i = 1;i<=fac;i++)
            pro *= i;
        System.out.print("The factorial is : "+ pro);
    }
}
