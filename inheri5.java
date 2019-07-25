class parent1
{
parent1(int a)
{
System.out.println("1 arg constructor	");
}
}
class child1 extends parent1
{
child1()
{
super(10);//calling super class
System.out.println("child constructor");
}

public static void main(String args[])
{
new child1();
}
}
//simply child class class parent class constructor 
/*
lib@lib-OptiPlex-3010:~$ javac inheri5.java
lib@lib-OptiPlex-3010:~$ java child1
1 arg constructor	
child constructor
*/
