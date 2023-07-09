package javaOperators;

public class UnaryOperator {
    public static void main(String[] agrs){
        int p = 5 , q = 5;

        System.out.println(p++);//5
        System.out.println(p);//6

        System.out.println(++q);//6
        System.out.println(q);//6

        int x = p++;//6
        int y = ++q;//7

        System.out.println(x);//7
        System.out.println(y);//7

        System.out.println(p);//7
        System.out.println(q);//7
    }
}
