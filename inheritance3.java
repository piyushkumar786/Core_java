//prevent inheritance
//if we declare final keyword then prevent inheritance ....child class not possible
class A
{void m1()
{
System.out.println("method 1");
}
void m2()
{
System.out.println("method 2");
}
}
final class B extends A
{
void m3()
{
System.out.println("method 3");
}
void m4()
{
System.out.println("method 4");
}
}
class C extends B
{
void m5()
{
System.out.println("method 5");
}
void m6()
{
System.out.println("method 6");
}
public static void main(String args[])
{
A a=new A();
a.m1(); a.m2();
B b=new B();
b.m1(); b.m2(); b.m3(); b.m4();
C c=new C();
c.m1(); c.m2(); c.m3(); c.m4(); c.m5(); c.m6();
}
}
/*
lib@lib-OptiPlex-3010:~$ javac inheritance3.java
inheritance3.java:24: error: cannot inherit from final B
class C extends B
                ^
1 error
*/
