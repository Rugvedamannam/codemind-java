import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            System.out.printf("%d ",i);
        }
    }
}