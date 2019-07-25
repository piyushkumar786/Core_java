class parent 
{
{
System.out.println("instance block of parent");
}
parent()
{
System.out.println("parent class constructor");
}
}
class child extends parent
{
{ System.out.println("child class ins block"); }
child()
{
System.out.println("child class constructor");
}

public static void main(String args[])
{
new child();

}

}
/*
//first instace block execute then constructor execute...s
piyush@piyush-ESPRIMO-E5730:~$ javac inherins2.java
piyush@piyush-ESPRIMO-E5730:~$ java child
instance block of parent
parent class constructor
child class ins block
child class constructor
*/
