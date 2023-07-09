package assignment;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String last_name = sc.next();
        int rollNo = sc.nextInt();
        String FOI = sc.next();

        System.out.println("Name: "+name+" "+last_name);
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Field of interest: "+FOI);
    }
}
