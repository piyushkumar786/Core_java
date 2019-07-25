//instance block2
class instance2
{
instance()
{
System.out.println("this is 0 arg constructor");
}
instance(int a)
{
System.out.println("this is 1 arg constructor");
}
instance(int a,int b)
{
System.out.println("this is 2 arg constructor");
}
{
System.out.println("instance block ");
}
public static void main(String args[])
{
new instance2();//when object creation constructor and instance block are also createed
//but instance block are execute first then execute the constructor
new instance2(10);
new instance2(20,30);
}

}
