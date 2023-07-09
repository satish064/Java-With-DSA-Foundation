package Conditional;

public class Assignmentquestion2 {
    public static void main(String[] args)
    {
        int n = 100;
        for(int i = 1;i<=n;i++)
        {
            if(i % 5 == 0 || i % 7 == 0)
                continue;
            else
                System.out.println(i);
        }
    }

}

