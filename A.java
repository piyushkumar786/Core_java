class A
{
static
{
System.out.println("A class static");
}
public static void main(String args[]) throws ClassNotFoundException
{
Class.forName("B");
Class.forName("C");
}
}
//if main not present in the class then it is difficult to call ststic block..so,forname method  are use for reference of the another class
/*
lib@lib-OptiPlex-3010:~$ javac B.java
lib@lib-OptiPlex-3010:~$ javac C.java
lib@lib-OptiPlex-3010:~$ javac A.java
lib@lib-OptiPlex-3010:~$ java A
A class static
B class static
C class static
*/
