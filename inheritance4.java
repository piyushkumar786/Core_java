//represent child class componet this keyword
//represent superclass variable by superclass keyword
class parent
{
int a=10;
int b=20;
}
class child extends parent
{
int a=100;
int b=200;
void add(int a,int b)
{
System.out.println(a+b);//local variable
System.out.println(this.a+this.b);//current...same class
System.out.println(super.a+super.b);//super...patent class
}
public static void main(String args[])
{
new child().add(1000,2000);

}
}
//this condition useful for all variable have same name
/*
lib@lib-OptiPlex-3010:~$ javac inheritance4.java
lib@lib-OptiPlex-3010:~$ java child
3000
300
30
*/
