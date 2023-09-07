import java.util.*;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        s=n*n;
        String s1=Integer.toString(n);
        String s2=Integer.toString(s);
        if(s2.endsWith(s1))
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}