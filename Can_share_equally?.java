import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int x,y;
        x=n.nextInt();
        y=n.nextInt();
        if(x%2==0 && (x>0||y%2==0))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}