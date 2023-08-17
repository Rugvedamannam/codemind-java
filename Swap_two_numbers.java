import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b,c;
        a=n.nextInt();
        b=n.nextInt();
             c=a;
             a=b;
             b=c;
        System.out.printf("%d%n%d",a,b);
    }
}