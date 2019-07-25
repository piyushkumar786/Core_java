class parent1
{
parent1()
{
System.out.println("parent constructor");
}
}
class child1 extends parent1
{
child1()
{
this(10);
super();
System.out.println("0-arg child constructor");
}

child1(int a)
{

System.out.println("1-arg child constructor");

}
public static void main(String args[])
{
new child1();
}
}
//super declare at first line in the constructor
/*
lib@lib-OptiPlex-3010:~$ javac inheri2.java
inheri2.java:13: error: call to super must be first statement in constructor
super();
     ^
1 error
*/
