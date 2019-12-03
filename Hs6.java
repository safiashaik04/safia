import java.util.*;
class Hs6
{
public static void main(String args[])
{
double interest=0;
String gender=args[0];
int age=Integer.parseInt(args[1]);
if(gender.equals("Male"))
{
if(age>=1 && age<=60)
interest=8.3;
else if(age>=61 && age<=120)
interest=7.6;
else
System.out.println("Male's age is greater than 120");
}
else if(gender.equals("Female"))
{
if(age>=1 && age<=58)
interest=8.2;
else if(age>=59 && age<=120)
interest=7.6;
else
System.out.println("Female's age is greater than 120");
}
System.out.println("Interest:"+interest);
}
}