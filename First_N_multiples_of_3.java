import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int i,j=1,s;
        s=n.nextInt();
        for(i=1;i<=s;i++)
        {
            j=3*i;
            System.out.printf("%d ",j);
        }
    }
}