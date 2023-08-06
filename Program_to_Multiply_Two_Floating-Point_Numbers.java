import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        float a,b,c;
        a=n.nextFloat();
        b=n.nextFloat();
        c=a*b;
        System.out.printf("%.2f",c);
    }
}