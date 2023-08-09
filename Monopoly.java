import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b,c,i,s;
        s=n.nextInt();
        for(i=1;i<=s;i++)
        {
            a=n.nextInt();
            b=n.nextInt();
            c=n.nextInt();
            if((a+b)<c || (b+c)<a || (c+a)<b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}