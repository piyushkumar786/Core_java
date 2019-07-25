//method passing class object as parameter
class x{

}
class teacher{

}
class y{

}
class student{

}

class method3
{
public static void main(String args[])
{
method3 m=new method3();
x x1=new x();
teacher t=new teacher();
m.m1(x1,t);
m.m1(new x(),new teacher());//above three line reduce by one line
y y1=new y();
student s=new student();
method3.m2(y1,s);
method3.m2(new y(),new student());
}
void m1(x x1,teacher t)
{
System.out.println("instance method call by obj");

}
static void m2(y y1,student s)
{
System.out.println("static metyhod called by the class name");

}
}
