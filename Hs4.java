import java.util.*;
class Hs4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char a,b;
a=sc.next().charAt(0);
b=sc.next().charAt(0);
if(a<b)
System.out.println(a+","+b);
else
System.out.println(b+","+a);
}
}