import java.util.*;
class Hs12
{
public static void main(String args[])
{
int remainder,n;
boolean flag=true;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=2;i<=n/2;i++)
{
remainder=n%i;
if(remainder==0)
{
flag=false;
break;
}
}
if(flag)
System.out.println(n+" is a prime number");
else
System.out.println(n+" is not a prime number");
}
}