import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int i,s,x,y,r,e;
        s=n.nextInt();
        for(i=1;i<=s;i++)
        {
            x=n.nextInt();
            y=n.nextInt();
            r=x/y;  
            e=x%y;
            System.out.printf("%d%n",r+e);
        }
    }
}