class parent1
{

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
//if not parent constructor present but also child constructor msg print....becoz default construtor is present 
/*
lib@lib-OptiPlex-3010:~$ javac inheri4..java
lib@lib-OptiPlex-3010:~$ java child1
child constructor
*/
