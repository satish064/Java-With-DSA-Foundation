package Loops.Problem;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Decimal Number : ");
        int Decimal = sc.nextInt();
        int digit,pro=1,Binary = 0;
        while(Decimal > 0)
        {
            digit = Decimal % 2;
            Binary = Binary * 10 + digit;
            Decimal /= 2;
        }
        System.out.printf("The Binary equivalent is " + Binary);

    }
}
