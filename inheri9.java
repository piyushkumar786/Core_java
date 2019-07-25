class parent1
{
parent1()
{
System.out.println("0 arg constructor	");
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
lib@lib-OptiPlex-3010:~$ javac inheri9.java
lib@lib-OptiPlex-3010:~$ java child1
0 arg constructor	
child constructor
0 arg constructor	
child constructor
*/
