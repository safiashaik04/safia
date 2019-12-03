import java.util.*;
class Hs1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to check if it is positive or negative");
int n=sc.nextInt();
if(n>0)
System.out.println("Positive");
else
System.out.println("Negative");
System.out.println("Enter a number to check if it is even or odd");
n=sc.nextInt();
if(n%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
}