//case-4
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
System.out.println(10/0);
}
finally
{
System.out.println("finally block");
}
}
}

/*
//sir ji,here arithmetic exeception occur then catch block but catch block also containing arithmaetic exception so fianlly nlock execute then exception occur

piyush@piyush-ESPRIMO-E5730:~$ javac excep9.java
piyush@piyush-ESPRIMO-E5730:~$ java test
finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at test.main(excep9.java:12)
*/
