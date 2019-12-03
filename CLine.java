import java.util.*;
class CLine
{
public static void main(String args[])
{
int i;
int l=args.length;
if(l==0)
System.out.println("No values");
else
for(i=0;i<l;i++)
{
System.out.print(args[i]+",");
}
}
}