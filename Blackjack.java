import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b,c;
        a=n.nextInt();
        b=n.nextInt();
        c=21-a-b;
        if(c>=1 && c<=10)
        {
            System.out.print(c);
        }
        else 
        {
            System.out.print(-1);
        }
    }
}