//constructor
//create object foolowing way
//1.new keyword
//2.instance factory 
//3.static factory
//4.pattern factory method
//5.new instance method
//6.clone process
//7.deserialization process
//test t=new test();
//test--class
//t---object
//new -keyword create object
//test()---constructor
//rules of constructor java
//1.constructor and class name same
//2.constructor able take parameter
//3.constructor not allowed return type
 
class constructor1
{
constructor1()//0-arg constructor
 {
System.out.println("0 arg constructor");
}
constructor1(int a)//0-arg constructor
 {
System.out.println("1 arg constructor");
}
//inside class no constructor then compiler generate zero arugement constructor...it also called as default constructor
public static void main(String args[])
{
constructor1 c1=new constructor1();
constructor1 c2=new constructor1(10);
c1.m1();
c2.m1();
}
void m1()//instance metod
{
System.out.println("m1 method");
}
}

//types of the constructor
//1.default constructor provided by compliler(0-arg cons)
//user defined constructor.....(parameter constructor)
//jvm not generete constructor
//jvm execute constructor
