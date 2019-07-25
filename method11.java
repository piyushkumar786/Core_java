//java not support opearator oveloading but only one operator overload +(plus)
class method11
{
public static void main(String args[])
{
int a=10;
int b=20;
int c=30;
System.out.println("piyush"+"kumar");
System.out.println(10+20);
System.out.println(10+20+"durga"+"ratan");
System.out.println(10+20+"durga"+"ratan"+100+200);
System.out.println(a+"----");
System.out.println(a+"----"+b+"-----");
System.out.println(a+"-----"+b+"-----"+c+"-----");
}
}
//only  + opeartor overloaded in the java
//basically opeartor overloaded mean one thing have multiple fuction + oprerator use as concat of two string and addition of two nu8mber
/*
lib@lib-OptiPlex-3010:~$ javac method11.java
lib@lib-OptiPlex-3010:~$ java method11
piyushkumar
30
30durgaratan
30durgaratan100200
10----
10----20-----
10-----20-----30-----

*/
