import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        float a,b,c;
        float s;
        double r;
        Scanner n=new Scanner(System.in);
        a=n.nextInt();
        b=n.nextInt();
        c=n.nextInt();
        s=(a+b+c)/2;
        r=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",r);
    }
}