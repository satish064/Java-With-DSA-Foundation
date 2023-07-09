package Conditional.AssignmentQuestions;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a cost price: ");
        float cp = sc.nextFloat();
        System.out.print("Enter a selling price: ");
        float sp = sc.nextFloat();
        if(sp>cp)
        {
            float profit = sp - cp;
            System.out.println("Profit = "+ profit);
        }
        else
        {
            float loss = cp - sp;
            System.out.println("Loss = "+loss);
        }

    }
}
