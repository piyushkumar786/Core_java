//case-9
class test
{
void m1()
{
m2();
}
void m2()
{
m3();
}

void m3()
{
try
{
System.out.println(10/0);
}
catch(ArithmeticException ae)
{
//method which print the exception
System.out.println(ae.toString());
System.out.println(ae.getMessage());
ae.printStackTrace();
}
}
public static void main(String args[])
{
new test().m1();
}
}
/*

piyush@piyush-ESPRIMO-E5730:~$ javac excep14.java
piyush@piyush-ESPRIMO-E5730:~$ java test
java.lang.ArithmeticException: / by zero//tostring
/ by zero//getmesage
java.lang.ArithmeticException: / by zero//printStackTrace
	at test.m3(excep14.java:16)
	at test.m2(excep14.java:9)
	at test.m1(excep14.java:5)
	at test.main(excep14.java:28)
*/
