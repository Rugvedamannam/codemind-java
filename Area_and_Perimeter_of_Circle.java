import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a;
        double b,c;
        a=n.nextInt();
        b=3.14*a*a;
        c=2*3.14*a;
        System.out.printf("%.2f
",b);
        System.out.printf("%.2f",c);
    }
}