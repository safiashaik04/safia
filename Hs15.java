import java.util.*;
class Hs15
{
public static void main(String args[])
{
int sum=0,n,r;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println("Sum is: "+sum);
}
}