import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int x,y,z,r;
        x=n.nextInt();
        y=n.nextInt();
        z=n.nextInt();
        r=(z-y)/x;
        System.out.print(r);
    }
}