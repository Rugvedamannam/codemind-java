import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        double sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            sum=sum+Math.sqrt(i);
        }
        System.out.printf("%.2f",sum);
    }
}