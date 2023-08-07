import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b;
        a=n.nextInt();
        b=a*(a-1)/2;
        System.out.printf("%d",b);
    }
}