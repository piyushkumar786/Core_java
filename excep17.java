//jvm give the exception msg
//jvm also create obj of the exception internally i.e ae
//it use user definied Exception,user define object
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
throw new ArithmeticException("not eligible /by zero");
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
//throw use for user define exception...own exception write in jvm 
// throw new ArithmeticException(statement)...


piyush@piyush-ESPRIMO-E5730:~$ javac excep17.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
21
eligible for mrg
piyush@piyush-ESPRIMO-E5730:~$ javac excep17.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
13
Exception in thread "main" java.lang.ArithmeticException: not eligible /by zero
	at test.status(excep17.java:15)
	at test.main(excep17.java:24)*/
