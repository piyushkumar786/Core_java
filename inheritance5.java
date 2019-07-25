class parent
{
void m1()
{
System.out.println(" parent m1 method1");
}
}
class child1 extends parent
{
void m1()
{
System.out.println("child m1 method1");
}
void m2()
{
super.m1();//after super keyword parent method call
m1();
}
public static void main(String args[])
{
new child1().m2();
}
}
//first priority goes to child class
//this problem remove by the this keyword to the method  
/*
lib@lib-OptiPlex-3010:~$ javac inheritance5.java
lib@lib-OptiPlex-3010:~$ java child1
child m1 method1
child m1 method1
*/
//after super keyword output is:
/*
lib@lib-OptiPlex-3010:~$ javac inheritance5.java
lib@lib-OptiPlex-3010:~$ java child1
 parent m1 method1
child m1 method1
*/
