//return type is mandory
//it may be primitive,class type,array type,enum type
//if return type other than void then return value by return keyword
//if not write then erroer msg occur
// int m1{ return 10;}//it is inavlid..retuen statement is last step of the method
/*int m1()
{ return 10;} ...test t=newtest();
int a=t.m1();
//holding the value is thwe optional
...return 10 value..becoz hold value is the optional*/
class method12
{
public static void main(String args[])
{
method12 m=new method12();
m.m1();
//store
int a=m.m1();//store return value of m1() 
System.out.println("return value int"+a);
float b=m.m1();//store return value of m1() 
System.out.println("return value float"+b);
char c=m.m3();//store return value of m1() 
System.out.println("return value of char"+c);
}
int m1()
{
return 10;
}
float m2()
{
return 10.52f;//f constant require for floating value
}
char m3()
{
return 'c';
}
}
//when i am not print print return value then output
/*
lib@lib-OptiPlex-3010:~$ javac method12.java
lib@lib-OptiPlex-3010:~$ java method12
lib@lib-OptiPlex-3010:~$ 
*/
//when i am store return value in int variatble the output
/*
lib@lib-OptiPlex-3010:~$ javac method12.java
lib@lib-OptiPlex-3010:~$ java method12
return vlaue10
*/
//for floating value return type
/*
lib@lib-OptiPlex-3010:~$ java method12
return vlaue10
return vlaue10.0
*/
