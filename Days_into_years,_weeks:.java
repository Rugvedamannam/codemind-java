import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b,c;
        a=n.nextInt();
        b=a/365;
        c=(a-(b*365))/7;
        System.out.printf("%d%n%d",b,c);
    }
}