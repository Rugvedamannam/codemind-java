import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int t,s,b,r;
        t=n.nextInt();
         s=n.nextInt();
          b=n.nextInt();
          r=2*t*s*b*512;
          System.out.print(r);
    }
}