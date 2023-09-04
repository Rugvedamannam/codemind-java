import java.util.*;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                x=x+i;
            }
        }
        if(x>n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}