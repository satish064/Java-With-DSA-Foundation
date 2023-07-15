package Loops.Problem;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Binary Number(1 And 0): ");
        int Binary_Num = sc.nextInt();
        int pow = 1,sum = 0,d;
        while(Binary_Num > 0)
        {
            d = Binary_Num%10;
            sum += pow * d;
            Binary_Num /= 10;
            pow *= 2;
        }
        System.out.printf("Decimal number is : "+ sum);
    }
}
