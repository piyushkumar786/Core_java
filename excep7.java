//case2-
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
System.out.println("finally block");
}
}
}

/*
//the Exception match so catch block execute later finally block execute
piyush@piyush-ESPRIMO-E5730:~$ java test
catch block
finally block
*/
