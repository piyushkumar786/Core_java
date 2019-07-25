//two class name is name that type how return current class object
class method14
{
public static void main(String args[])
{
method14 m=new method14();
method14 t1=m.m1();
method14 t2=m.m2();
}
method14 m1()
{
System.out.println("m1 method");
method14 t=new method14();
return t;
//return new test();
}
method14 m2()
{
System.out.println("m2 method");
return this;
}
}
//the second class print due to this keyword,else
//method m1 print two time
/*
lib@lib-OptiPlex-3010:~$ javac method14.java
lib@lib-OptiPlex-3010:~$ java method14
m1 method
m2 method
*/
