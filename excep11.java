//case-6
class test
{
public static void main(String args[])
{
try
{
System.out.println(10/0);
}
finally
{
System.out.println("finally");
}
}
}
/*
//try and finally also possible
piyush@piyush-ESPRIMO-E5730:~$ java test
finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at test.main(excep11.java:8)
*/
