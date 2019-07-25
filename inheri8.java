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
System.out.println("child constructor");
}

public static void main(String args[])
{
new child1();
}
}
//if super and this keyword not used then system automatically used this and super keyword so,it called parent class constructor..at first line of the constructor
/*
lib@lib-OptiPlex-3010:~$ javac inheri8.java
inheri8.java:11: error: constructor parent1 in class parent1 cannot be applied to given types;
{
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
lib@lib-Op
*/
