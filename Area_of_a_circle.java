import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        float a;
        double s;
        a=n.nextFloat();
        s=3.14*a*a;
        System.out.printf("%.2f",s);
    }
}