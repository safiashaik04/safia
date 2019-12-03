import java.util.*;
class Hs17
{
public static void main(String args[])
{
int num, reverse=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num != 0) {
int digit = num % 10;
reverse = reverse* 10 + digit;
num /= 10;
}
System.out.println("Reversed Number: " + reverse);
}
}