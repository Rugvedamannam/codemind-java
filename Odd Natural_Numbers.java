import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int i,s;
        s=n.nextInt();
        for(i=1;i<=s;i++)
        {
           if(i%2!=0)
           System.out.printf("%d ",i);
        }
    }
}