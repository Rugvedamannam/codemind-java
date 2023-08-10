import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a,i,n,c;
        c=0;
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            a=s.nextInt();
            if(n>a)
            {
                c++;
            }
        }
            if(c==n)
            {
                System.out.printf("YES");
            }
            else
            {
                System.out.print("NO");
            }
    }
}