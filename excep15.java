//case-10
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
System.out.println(10/0);
}
public static void main(String args[])
{
new test().m1();
}
}

/*
//by default printStackTrace method present in the jvm
piyush@piyush-ESPRIMO-E5730:~$ java test
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at test.m3(excep15.java:15)
	at test.m2(excep15.java:10)
	at test.m1(excep15.java:6)
	at test.main(excep15.java:19)
*-/
