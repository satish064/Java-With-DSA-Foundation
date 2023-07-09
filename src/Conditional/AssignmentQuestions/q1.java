package Conditional.AssignmentQuestions;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breath");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        if(length == breadth)
            System.out.println("It is a square");
        else System.out.println("It is a rectangle");
    }
}
