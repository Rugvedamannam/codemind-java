import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        char ch;
        ch=n.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.print("uppercase alphabet");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.print("lowercase alphabet");
        }
        else
        {
            System.out.print("not an alphabet");
        }
    }
}