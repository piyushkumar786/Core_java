//object return type
class method13
{
public static void main(String args[])
{
method15 m=new method15();
x x2=m.m1();
System.out.println(x2);
y y2=m.m2();
System.out.println(y2);
String str=m.m3();
}
x m1()
{
System.out.println("method m1");
x x1=new x();
return x1;
//return new x(); it also possible at project level
}
y m2()
{
System.out.println("method m2");
y y1=new y();
return y1;
//return new y(); it also possible at project level
}
static String m3()
{
System.out.println("m3 method");
return "piyush";
}
} 
class x{}
class y{}

//class print the hash code
/*
lib@lib-OptiPlex-3010:~$ javac method13.java
lib@lib-OptiPlex-3010:~$ java method13
method m1
x@7440e464
method m2
y@78308db1
m3 method
*/
