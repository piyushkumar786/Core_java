class parent1
{
parent1(int a)
{
//super(); compiler also generate super class at the first line then where parent class..ans is the parent class is object class execute default class
System.out.println("1 arg constructor	");
}
}
class child1 extends parent1
{
child1()
{
//super()...compiler generate 0 arg constructor
System.out.println("child constructor");
}

child1(int a)
{
//super();compiler genreate super()...which is 0 arg constructor
System.out.println("child constructor");
}
public static void main(String args[])
{
new child1();
new child1(10);
}
}
/*
//error generate because no zero arg constructor present 
lib@lib-OptiPlex-3010:~$ javac inheri10.java
inheri10.java:11: error: constructor parent1 in class parent1 cannot be applied to given types;
{
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
inheri10.java:17: error: constructor parent1 in class parent1 cannot be applied to given types;
{
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
2 errors
*/
