import java.util.*;
class test
{
static void status(int age) throws InvalidAgeException
{
if(age>18)
{
System.out.println("eligible for mrg");
}
else
{
throw new InvalidAgeException("not eligible/ by zero");//default constructor...0-arg constructor
}
}

public static void main(String args[]) throws InvalidAgeException
{
Scanner s=new Scanner(System.in);
System.out.println("enter your age");
int age=s.nextInt();
test.status(age);
}

}
/*
//it is paremter user definied checked exception
piyush@piyush-ESPRIMO-E5730:~$ javac InvalidAgeException1.java
piyush@piyush-ESPRIMO-E5730:~$ javac excep19.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
19
eligible for mrg
piyush@piyush-ESPRIMO-E5730:~$ javac excep19.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
15
Exception in thread "main" InvalidAgeException: not eligible/ by zero
	at test.status(excep19.java:12)
	at test.main(excep19.java:21)
*/
