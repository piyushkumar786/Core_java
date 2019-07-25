class method6

{
public static void main(String args[])
{

method6 m=new method6();
m.m1();


}
m1()
{
System.out.println("instance method call by obj");

}

}
//return type is mandory
/*
lib@lib-OptiPlex-3010:~$ javac method6.java
method6.java:12: error: invalid method declaration; return type required
m1()
^
1 error
*/
