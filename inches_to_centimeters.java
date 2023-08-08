import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a;
        double b;
        a=n.nextInt();
        b=2.54*a;
        System.out.printf("%.2f",b);
    }
}