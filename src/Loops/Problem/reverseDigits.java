package Loops.Problem;
import java.util.Scanner;
public class reverseDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int lastDigit = 0,reverseNumber = 0,pro = 10;
        while(num > 0)//12
        {
            lastDigit = num % 10;//2
            reverseNumber =  reverseNumber * 10 + lastDigit;
            num /= 10;//1
        }
        System.out.println("Reverse number is "+reverseNumber);
    }
}
