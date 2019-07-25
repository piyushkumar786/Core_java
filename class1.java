class class1
{
int a=10;//instance variable
static int b=20;//static variable
void m1()
{
System.out.println("instance method");
}
static void m2()
{
System.out.println("static method");
}
{
System.out.println("instance  block");
}
static
{
System.out.println("static block");
}
class1()
{
System.out.println("0 arg constructor");
}
class1(int a)
{
System.out.println("1 arg constructor");
}
public static void main(String args[])
{
class1 c=new class1();//call deafult constructor
class1 c1=new class1(10);//1-arg constructor
c.m1();//instace function call
class1.m2();//static function call
}
}
/*
lib@lib-OptiPlex-3010:~$ javac class1.java
lib@lib-OptiPlex-3010:~$ java class1
static block
instance  block
0 arg constructor
instance  block
1 arg constructor
instance method
static method

*/
