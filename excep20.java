import java.util.*;
class test
{
static void status(int age) //throws optional
{
if(age>18)
{
System.out.println("eligible for mrg");
}
else
{
throw new InvalidAgeException();//default constructor...0-arg constructor
}
}

public static void main(String args[])//throws optional
{
Scanner s=new Scanner(System.in);
System.out.println("enter your age");
int age=s.nextInt();
test.status(age);
}

}
/*
//runtime exception default constructor
piyush@piyush-ESPRIMO-E5730:~$ javac InvalidAgeException3.java
piyush@piyush-ESPRIMO-E5730:~$ javac excep20.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
12
Exception in thread "main" InvalidAgeException
	at test.status(excep20.java:12)
	at test.main(excep20.java:21)
*/
