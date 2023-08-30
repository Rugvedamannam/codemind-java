import java.util.Scanner;  
public class AutomorphicNumberExample2  
{  
public static void main(String args[])  
{  
Scanner in = new Scanner(System.in);  
int num = in.nextInt();  
int count=0;  
int square = num*num;  
int temp = num;    
while(temp>0)  
{  
count++;  
//removes last digit of the variable num  
temp=temp/10;  
}   
//determines the last digit of the variable square  
int lastDigit = (int) (square%(Math.pow(10, count)));   
//compare num with last digit of the variable square  
if(num == lastDigit)  
System.out.println("Automorphic Number");  
else  
System.out.println("Not an Automorphic Number");  
}  
}