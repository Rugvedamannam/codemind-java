import java.util.*;
public class sample{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] arr=s.split(" ");
    for(int i=0;i<arr.length;i++)
    {
        //System.out.print(arr[i].length());
        int sum=0;
     for(int j=0;j<arr[i].length();j++)
        {
            sum=sum+1;
        }
        System.out.printf("%d ",sum);
    }
}
}