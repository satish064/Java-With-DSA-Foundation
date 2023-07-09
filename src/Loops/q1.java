package Loops;

public class q1 {
    public static void main(String[] args)
    {
        int i = 1;
        do
        {
            if(i % 5 == 0 && i % 7 == 0)
            {
                System.out.println(i);
                break;
            }
            i++;
        }while(true);
    }
}
