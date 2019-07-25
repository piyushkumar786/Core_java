//instance block4
class instance4
{
instance4()
{
this(10);
System.out.println("this is 0 arg constructor");
}
instance4(int a)
{
System.out.println("this is 1 arg constructor");
}
{
System.out.println("instance block 1");
}
{
System.out.println("instance block 2");
}
public static void main(String args[])
{
new instance4();//when object creation constructor and instance block are also createed

}

}
//for each constructor only once instance block execute...and execute down up
/*
lib@lib-OptiPlex-3010:~$ javac instanceblock4.java
lib@lib-OptiPlex-3010:~$ java instance4
instance block 1
instance block 2
this is 1 arg constructor
this is 0 arg constructor
*/
