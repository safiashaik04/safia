import java.util.*;
class Hs16
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int i,j;
for(i=1;i<=n;i++)
{
  for(j=1;j<=n;j++)
{
  if(j<=i)
  System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}