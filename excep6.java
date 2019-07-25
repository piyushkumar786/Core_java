//case1-
class test
{
public static void main(String args[])
{
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
System.out.println("finally block");
}
}
}
/*
//fianlly block excute before catch and if not match catch block then execute final block
piyush@piyush-ESPRIMO-E5730:~$ javac excep6.java
piyush@piyush-ESPRIMO-E5730:~$ java test
try block
finally block
*/
