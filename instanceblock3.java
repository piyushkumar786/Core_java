//instance block3
class instance3
{
instance3()
{
System.out.println("this is 0 arg constructor");
}
{
System.out.println("instance block ");
}
public static void main(String args[])
{
new instance2();//when object creation constructor and instance block are also createed
new instance3();
new instance3();
}

}
//for every object instance block execute
/*
lib@lib-OptiPlex-3010:~$ javac instanceblock3.java
lib@lib-OptiPlex-3010:~$ java instance3
instance block 
this is 0 arg constructor
instance block 
this is 0 arg constructor
instance block 
this is 0 arg constructor
*/
