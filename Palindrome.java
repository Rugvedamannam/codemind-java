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
            s=s*10+r;
            n=n/10;
        }
       if(s==q)
       {
           System.out.print("Palindrome");
       }
       else
       {
           System.out.print("Not Palindrome");
       }
    }
}