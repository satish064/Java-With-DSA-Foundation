package Loops.Problem;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class digitSum {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0,lastDigit = 0;
        while(num > 0)
        {
            lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("The sum of the digits is "+ sum);
    }


}
