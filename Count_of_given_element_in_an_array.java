import java.util.*;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int z=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==z)
            {
                c=c+1;
            }
        }
        System.out.print(c);
    }
}