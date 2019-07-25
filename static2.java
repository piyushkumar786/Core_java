//static block
class staticblock2
{

static //static block
{
System.out.println("static 1");
}
static
{
System.out.println("static 2");
}

public static void main(String args[])
{

}
}
//it show static block execute during .class file execute
/*
lib@lib-OptiPlex-3010:~$ javac static2.java
lib@lib-OptiPlex-3010:~$ java staticblock2
static 1
static 2
*/
//upto 1.4 version method it execute static block without main method...but 1.6 version not possible
//main method is mandotary for ststic block and instance block
