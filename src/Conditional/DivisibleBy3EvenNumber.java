package Conditional;
import java.util.Scanner;
public class DivisibleBy3EvenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0 && num % 3 == 0)
        {
            System.out.println("Divisible by 3");
        }
    }
}
