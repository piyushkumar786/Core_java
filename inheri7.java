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
super();//calling super class
System.out.println("child constructor");
}

public static void main(String args[])
{
new child1();
}
}
//as previous example if no parent constructor write then atomatically default constructor is called.but this example one parameter constructor is present in the parent classs no default constructor is generate.simply meaning is if one constructor present then not generate default constructor.
/*
lib@lib-OptiPlex-3010:~$ javac inheri7.java
inheri7.java:12: error: constructor parent1 in class parent1 cannot be applied to given types;
super();//calling super class
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
*/
