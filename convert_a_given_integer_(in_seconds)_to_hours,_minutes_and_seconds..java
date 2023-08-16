import java.util.Scanner;
public class ample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b,c,d;
        a=n.nextInt();
        b=a/3600;
        c=(a-(b*3600))/60;
        d=(a-(b*3600)-(c*60));
        System.out.printf("H:M:S-%d:%d:%d",b,c,d);
    }
}