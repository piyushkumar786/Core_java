//case-8
class test
{

public static void main(String args[])
{
System.out.println(10/0);
try
{
System.out.println("try block");

}
catch(ArithmeticException ae)
{
System.out.println("catch block");
}
finally
{
System.out.println("finally");
}
}
}
/*
//exception occur because stement write outside the class so,no try catch finally block handle
piyush@piyush-ESPRIMO-E5730:~$ java test
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at test.main(excep13.java:7)
*/
