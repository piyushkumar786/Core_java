//simple method
class method2

{
public static void main(String args[])
{
method2 m=new method2();
m.m1();
method2.m2();
}
void m1()
{
System.out.println("instance method call by obj");

}
static void m2()
{
System.out.println("static metyhod called by the class name");

}
}
