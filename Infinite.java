import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        for(int i=0;;i++)
        {
            a=sc.nextInt();
            if(a==-1)
            {
                break;
            }
            else
            {
                System.out.printf("%d
",a*a);
            }
        }
    }
}