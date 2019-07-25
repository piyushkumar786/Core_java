//class contain...1.variable..2.method..3.constructor..4.instance block..5.static block
//varible purposr-it store value.eg.emp_id,emp_name,emp_address
//three variable..1.local variable,2.instace variable..3.static variable
//1.local variable:it store in stack
//user definied method call it.
class variable
{
int c=100;//var declare inside the class but outside the method are called instace vcariable
int d=200;

public static void main(String args[])//variable declare inside the method called as local variable or constructor or block aslo.
{//it also called static method becox static declaration 
int a=10;//a is int type...it primitive type,class type,enum type
	//primitive type int a=10;
	//class type  ...Test t,Emp e
	//enum e
	//array type  ....int[] a;
	//String[] str;....every var have specfic type
int b=20;
System.out.println(a);
System.out.println(b);
variable v=new variable();
System.out.println(v.c);
System.out.println(v.d);
v.m1();//call instance method by using class var
/*void m1()//memory allocated when method start
{
int c=10;
int d=20;
System.out.println(a);
System.out.println(b);

}//memory realease when method end for local variable
void m2()
{
System.out.println(c);
System.out.println(d);//the value is not print becoz variable not global.it is local var for method m1 
}*/

//2.instance variable:java contain two area..instance area and static area
/*void m1()//instance method
{
//instance area
}
static void m1()//static method
{
//static area
}
inside class all method & constructor & blocks access
*/
}
void m1()//instance method
{
//instance area
//instsnce memory allocated when object  created
//memory destory when object destory
}
//access permission for variable
//direct access when insrtance variable present in instance method
//indirect access when differnt area preasent then acess through object refrence variable 
}
