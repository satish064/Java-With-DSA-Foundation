package Conditional.AssignmentQuestions;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operator(+,-,*,/");
        char operator = sc.next().charAt(0);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int operation;
        switch(operator)
        {
            case '+':
                operation = num1 + num2;
                System.out.println(operation);
                break;
            case '-':
                operation = num1 - num2;
                System.out.println(operation);
                break;
            case '*':
                operation = num1 * num2;
                System.out.println(operation);
                break;
            case '/':
                operation = num1 / num2;
                System.out.println(operation);
                break;
        }

    }
}
