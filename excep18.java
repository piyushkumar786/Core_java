//USER DEFINIED EXCEPTION
//user definied checked
//1.default cons
//2.parameter cons

//user definied unchecked
//1.default cons
//2.parameter cons



//USER DEFINIED CHECKED EXCEPTION BY USING DEFAULT CONSTRUCTOR
//ST1-CRAETE EXCEPTION
//ST2-EXCEPTION USE IN PROJECT


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
throw new InvalidAgeException();//default constructor...0-arg constructor
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
//default construtor exception
piyush@piyush-ESPRIMO-E5730:~$ javac InvalidAgeException.java
piyush@piyush-ESPRIMO-E5730:~$ java InvalidAgeException
Error: Main method not found in class InvalidAgeException, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
piyush@piyush-ESPRIMO-E5730:~$ javac excep18.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
18
Exception in thread "main" InvalidAgeException
	at test.status(excep18.java:28)
	at test.main(excep18.java:37)
*/
