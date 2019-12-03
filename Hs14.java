import java.util.*;
class Hs14
{
public static void main(String args[])
{
if(args.length!=0)
{
int n= Integer.parseInt(args[0]);
if(n==0||n==1)
System.out.println(n+"is neither prime nor composite");
int i,flag=0;
for(i=2;i<=Math.sqrt(n);i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==1)
System.out.println("given number "+n+" is not  prime");
else
System.out.println("given number "+n+" is  prime");
}
else
{
System.out.println("enter integer");
}
}
}