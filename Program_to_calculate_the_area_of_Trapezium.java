import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b,c;
        double d;
        a=n.nextInt();
        b=n.nextInt();
        c=n.nextInt();
        d=((a+b)*c)/2.0;
        System.out.printf("%.4f",d);
    }
}