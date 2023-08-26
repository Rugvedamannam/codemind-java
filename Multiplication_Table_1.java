import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=12;i++)
        {
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}