package Conditional.AssignmentQuestions;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        if(number < 0) {
            number = number * -1;
            System.out.println(number);
        }
        else {
            System.out.println(number);
        }

    }
}
