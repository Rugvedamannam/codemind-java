import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int c=n.nextInt();
        if(((a+b)>(a+c))&&((a+b)>(b+c)))
        {
            System.out.print(a+b);
        }
        else if(((a+c)>(b+c))&&((a+c)>(b+a)))
        {
            System.out.print(a+c);
        }
        else
        {
            System.out.print(b+c);
        }
    }
}