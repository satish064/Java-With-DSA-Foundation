package assignment;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three subjects marks: ");
        int n1 = sc.nextInt(); int  n2 = sc.nextInt() ; int n3 = sc.nextInt();
        int Total = n1+n2+n3;
        float Percentage = (Total/3)*100;
        System.out.println("Total marks:"+Total);
        System.out.println("Percentage marks:"+Percentage);
    }
}
