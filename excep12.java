//case-7
class test
{
public static void main(String args[])
{
try
{
System.out.println("try block");

System.exit(0);
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
//if exit write then we out from the jvm so next statement not execute
piyush@piyush-ESPRIMO-E5730:~$ javac excep12.java
piyush@piyush-ESPRIMO-E5730:~$ java test
try block
*/
