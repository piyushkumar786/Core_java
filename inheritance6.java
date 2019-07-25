class parent
{
parent()
{
System.out.println("parent class constructor");
}
}
class child2 extends parent
{
child2()
{
this(10);
System.out.println("child class 0 arg");
}
child2(int a)
{
super();//call 0- constructor arg of parent class
System.out.println("child class 1 arg");
}
public static void main(String args[])
{
new child2();
}
}

/*
//due to this keyword goes to child2 and super keyword execute parent constructor
//due to super key parent constructor execute
lib@lib-OptiPlex-3010:~$ javac inheritance6.java
lib@lib-OptiPlex-3010:~$ java child2
parent class constructor
child class 1 arg
child class 0 arg
*/
//video time:11:23/34:05
