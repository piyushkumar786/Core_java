class method8

{
public static void main(String args[])
{

method8 m=new method8();
m.m1();


}
void m1()
{
m2();//not declaration or expand function.it is the calling the function
System.out.println("method1");
m2();
}
void m2()
{
m3(10);
System.out.println("method2");
}
void m3(int a)
{
System.out.println("method 3");
}
}
//calling the function is the allowed 
/*
lib@lib-OptiPlex-3010:~$ javac method8.java
lib@lib-OptiPlex-3010:~$ java method8
method 3
method2
method1
method 3
method2
*/
