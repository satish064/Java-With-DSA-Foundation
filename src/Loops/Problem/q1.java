package Loops.Problem;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt())
        {
            int num = sc.nextInt();
            if(num >= 0)
            {
                sum += num;
            }
            else {
                sum = -1;
                break;
            }
        }
        System.out.println(sum );
    }
}
