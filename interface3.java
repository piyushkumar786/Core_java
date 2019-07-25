interface teacher//by default abstract class
{
void m1();//by default public abstrct method
void m2();
void m3();
}
abstract class test implements teacher
{
public void m1()//for interface public require
{
System.out.println("m1 method");
}
}
abstract class test1 extends test
{
public void m2()
{
System.out.println("m2 method");
}
}
class test2 extends test1
{

public void m3()
{
System.out.println("m3 method");
}
public static void main(String args[])
{
test2 t=new test2();
t.m1();
t.m2();
t.m3();
}
}
/*
//it can also possible method implement in different class
piyush@piyush-ESPRIMO-E5730:~$ javac interface3.java
piyush@piyush-ESPRIMO-E5730:~$ java test2
m1 method
m2 method
m3 method
*/
