class parent1
{
parent1()
{

System.out.println("1 arg constructor	");
}
}
class child1 extends parent1
{
/*
child()
{
super();
}
*/   //all this things genereted by the compiler
public static void main(String args[])
{
new child1();

}
}
/*
//default constructor generated by the obj then super() keyword generated by the compiler it call parent class constructor
lib@lib-OptiPlex-3010:~$ javac inheri11.java
lib@lib-OptiPlex-3010:~$ java child1
1 arg constructor	
*/