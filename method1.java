//method:two type...1:instance method...2:static metho
//example of the parameter passing  
class method1

{
public static void main(String args[])
{
method1 m=new method1();
m.m1(12,"piyush");
method1.m2('A',82);
}
void m1(int roll,String name)
{
System.out.println("instance method call by obj");
System.out. println("roll_no:"+roll);
System.out.println("name:"+name);
}
static void m2(char c,float marks)
{
System.out.println("static metyhod called by the class name");
System.out.println("div:"+c);
System.out.println("marks:"+marks);
}
}




