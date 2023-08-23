import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,q,r,s=0;
        n=sc.nextInt();
        q=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        System.out.print(s);
    }
}