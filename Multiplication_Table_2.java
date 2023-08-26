import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=m;i++)
        {
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}