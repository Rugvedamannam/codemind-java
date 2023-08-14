import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int i,j=0,s;
        s=n.nextInt();
        for(i=1;i<=s;i++)
        {
            j=i+j;
        }
        System.out.printf("%d ",j);
    }
}