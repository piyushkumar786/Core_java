//case-5
class test
{
public static void main(String args[])
{
try
{
System.out.println(10/0);
}
catch(ArithmeticException ae)
{
System.out.println("catch block");
}
finally
{
System.out.println(10/0);
}
}
}

/*
//the catch block excute first then finally block show the exception
piyush@piyush-ESPRIMO-E5730:~$ javac excep10.java
piyush@piyush-ESPRIMO-E5730:~$ java test
catch block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at test.main(excep10.java:16)
*/
