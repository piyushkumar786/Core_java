//static block execute during .class load on memory
//static block excute only once...only one class file execute


class parent 
{
{
System.out.println("instance block of parent");
}
parent()
{
System.out.println("parent class constructor");
}
static
{
System.out.println("parent class static block");
}
}
class child extends parent
{
{ System.out.println("child class ins block"); }
child()
{
System.out.println("child class constructor");
}
static
{
System.out.println("child class static block");
}
public static void main(String args[])
{
new child();

}

}
/*
//static block execute first becoz .class execute first then go to main memory then obj find then instace block and constructor execute becoz compiler generate super() ..then instace and constructor execute of child class 
piyush@piyush-ESPRIMO-E5730:~$ javac inherstatic.java
piyush@piyush-ESPRIMO-E5730:~$ java child
parent class static block
child class static block
instance block of parent
parent class constructor
child class ins block
child class constructor
*/
