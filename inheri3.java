class parent
{
parent()
{
System.out.println("parent constructor");
}
}
class child extends parent
{
child()
{
this(10);
System.out.println("0-arg child constructor");
}

child(int a)
{

System.out.println("1-arg child constructor");
super();
}
public static void main(String args[])
{
new child();
}
}
//super keyword must be write at the first line
/*
lib@lib-OptiPlex-3010:~$ javac inheri3.java
inheri3.java:20: error: call to super must be first statement in constructor
super();
     ^
*/

