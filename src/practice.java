import java.util.Scanner;
public class practice{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Entered Number: "+n);

        System.out.println("Enter float Number: ");
        float f = sc.nextFloat();
        System.out.println("Float Value: "+f);

        System.out.println("Enter boolean Value");
        boolean b = sc.nextBoolean();
        System.out.println("Boolean Value : "+b);

        System.out.println("Enter the Sentence");
        String s = sc.nextLine();
        System.out.println("Sentence is: "+s);

        System.out.println("Enter the word");
        String sw = sc.next();
        System.out.println("Word: "+sw);

        System.out.println("Enter Byte Value");
        byte by = sc.nextByte();
        System.out.println("Entered Byte Value: "+by);

        System.out.println("Enter the Double Value ");
        double d = sc.nextDouble();
        System.out.println("Enterd double value"+d);

        System.out.println("Enter short type value");
        short sh = sc.nextShort();
        System.out.println("Short: "+sh);

        System.out.println("Enter Long Type Value");
        double dou = sc.nextDouble();
        System.out.println("Double: "+dou);


    }
}