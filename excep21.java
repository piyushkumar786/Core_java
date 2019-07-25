import java.util.*;
class test
{
static void status(int age) 
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

public static void main(String args[]) 
{
Scanner s=new Scanner(System.in);
System.out.println("enter your age");
int age=s.nextInt();
test.status(age);
}

}

/*
//runtime exception parameter constructor
piyush@piyush-ESPRIMO-E5730:~$ javac InvalidAgeException3.java
piyush@piyush-ESPRIMO-E5730:~$ javac excep20.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
12
Exception in thread "main" InvalidAgeException
	at test.status(excep20.java:12)
	at test.main(excep20.java:21)
piyush@piyush-ESPRIMO-E5730:~$ javac InvalidAgeException4.java
piyush@piyush-ESPRIMO-E5730:~$ javac excep21.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
15
Exception in thread "main" InvalidAgeException
	at test.status(excep21.java:12)
	at test.main(excep21.java:21)
*/
