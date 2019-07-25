class method4

{
public static void main(String args[])
{
method4 m=new method4();
m.m1();

}
void m1()
{
System.out.println("instance method call by obj");

}
void m1()
{
System.out.println("static metyhod called by the class name");

}
}

//same method not allowed
/*
lib@lib-OptiPlex-3010:~$ javac method4.java
method4.java:15: error: method m1() is already defined in class method4
void m1()
     ^
1 error
*/
