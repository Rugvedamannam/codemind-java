import java.util.Scanner;
public class Temp{
     public static void main(String[] args)
     {
        Scanner n=new Scanner(System.in);
        float c;
        double f;
        c=n.nextFloat();
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
     }
}