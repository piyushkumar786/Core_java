//instance block2
class instance1
{
instance1()
{
System.out.println("this is 0 arg constructor");
}
{
System.out.println("instance block ");//instance block
}
public static void main(String args[])
{
new instance1();//when object creation constructor and instance block are also createed
//but instance block are execute first then execute the constructor

}

}
/*
lib@lib-OptiPlex-3010:~$ javac instanceblock1.java
lib@lib-OptiPlex-3010:~$ java instance1
instance block 
this is 0 arg constructor
*/
