class method5

{
public static void main(String args[])
{
int a=10;
method5 m=new method5();
m.m1();
m.m1(a);

}
void m1()
{
System.out.println("instance method call by obj");

}
void m1(int a)
{
System.out.println("static metyhod called by the class name");
System.out.println(a);
}
}
//same function name but different signature
/*
lib@lib-OptiPlex-3010:~$ java method5
instance method call by obj
static metyhod called by the class name
10
*/
