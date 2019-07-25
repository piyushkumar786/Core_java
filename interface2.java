interface teacher//by default abstract class
{
void m1();//by default public abstrct method
void m2();
void m3();
}

class student implements teacher
{
public void m1()//public is require for permission
{
System.out.println("m1 method");
}
public void m2()
{
System.out.println("m2 method");
}
public void m3()
{
System.out.println("m3 method");
}
public static void main(String args[])
{
new student().m1();
new student().m2();
new student().m3();
teacher t=new student();//it is also possible access by refrence student object of teacher
t.m1();
t.m2();
t.m3();
}
}
/*

piyush@piyush-ESPRIMO-E5730:~$ javac interface2.java
piyush@piyush-ESPRIMO-E5730:~$ java student
m1 method
m2 method
m3 method
m1 method
m2 method
m3 method
*/
