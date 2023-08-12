import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b,c;
        a=n.nextInt();
        b=n.nextInt();
        c=n.nextInt();
        if(a>b && a>c)
        {
            System.out.print(a);
        }
        else if(b>c && b>a)
        {
            System.out.print(b);
        }
        else
        {
            System.out.print(c);
        }
    }
}