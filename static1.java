//static block
class staticblock
{
{
System.out.println("instance 1");
}
{
System.out.println("instance 2");
}
static //static block
{
System.out.println("static 1");
}
static
{
System.out.println("static 2");
}
staticblock()
{
System.out.println();
}

staticblock(int a)
{
System.out.println(a);
}
public static void main(String args[])
{
new staticblock();
new staticblock(10);
}
}
//instace block depend on the number of the object creation but static block depend on the .class file execute..in the above program there are two object that why two times instance block called,where static block called only one times.it run top down apporch
/*
lib@lib-OptiPlex-3010:~$ javac static1.java
lib@lib-OptiPlex-3010:~$ java staticblock
static 1
static 2
instance 1
instance 2

instance 1
instance 2
10


*/
