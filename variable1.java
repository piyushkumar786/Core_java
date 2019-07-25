//static variable:the vaiable write inside class and outside the function with static keyword called static variable
//memory allocation:jvm load class file in memory and it calling main method called execution.ststic variable memory allocated when .class loaded
//permission:static area and instance area
//static variable access using class name (variable1.a)
class variable1
{//static variable
static int a=20;
static int b=10;
public static void main(String args[])
{
System.out.println(variable1.a);//static variable calling by class name
System.out.println(variable1.b);	
variable1 v=new variable1();
v.m1();//instance metod calling by object name
}
void m1()
{
System.out.println(variable1.a);
System.out.println(variable1.b);
}

}
//20
//10
