import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,r,a;
        n=sc.nextInt();
        a=n*n;
        while(a!=0)
        {
           r=a%10;
           s=s+r;
           a=a/10;
        }
        if(s==n)
        {
            System.out.print("Neon Number");
        }
        else
        {
             System.out.print("Not Neon Number");
        }
    }
}