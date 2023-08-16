import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b;
        a=n.nextInt();
        b=a%100;
        System.out.printf("%02d",b);
    }
}