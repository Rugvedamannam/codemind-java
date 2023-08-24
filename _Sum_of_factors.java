import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int s=n.nextInt();
        int x=0;
        for(int i=1;i<s;i++)
        {
            if(s%i==0)
            {
                x+=i;
            }
        }
        System.out.print(x);
    }
}