import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        float a,b;
        float c;
        a=n.nextInt();
        b=n.nextInt();
        c=(a+b)/2;
        System.out.printf("%.4f",c);
    }
}