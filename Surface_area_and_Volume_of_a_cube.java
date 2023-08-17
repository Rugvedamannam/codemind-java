import java.util.Scanner;
public class Example{
public static void main(String[] args){
    Scanner n=new Scanner(System.in);
int a,v,s;
//float s;
a=n.nextInt();
s=6*a*a;
v=a*a*a;
System.out.printf("Surface area = %d and Volume = %d",s,v);
}
}