import java.util.*;
class Hs13
{
public static void main(String args[])
{
int i =0;
int num =0;
String  numbers = "";
for (i = 10; i <=99; i++){		  	  
int counter=0; 	  
for(num =i; num>=1; num--)
{
if(i%num==0)
{
 counter = counter + 1;
}
}
if (counter ==2)
{
numbers = numbers + i + " ";
}	
}	
System.out.println("Prime numbers from 10 to 99 are :");
System.out.println(numbers);
}
}