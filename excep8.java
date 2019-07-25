//case-3
class test
{
public static void main(String args[])
{
try
{
System.out.println(10/0);
}
catch(NullPointerException ae)
{
System.out.println("catch block");
}
finally
{
System.out.println("finally block");
}
}
}

/*
//sir ji,hare arthimetic exception but catch block no contain that type of the exception so,finally block execute,abnormal exception generated
piyush@piyush-ESPRIMO-E5730:~$ javac excep8.java
piyush@piyush-ESPRIMO-E5730:~$ java test
finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at test.main(excep8.java:8)
*/
