import java.util.*;
class Hs18
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int t= n;
int r=0,s=0;
while(n>0)
{
r=n%10;
s=s*10+r;
n=n/10;
}
if(t==s)
System.out.println(t+"is a palindrome");
else
System.out.println(t+"is not a palindrome");
}
}