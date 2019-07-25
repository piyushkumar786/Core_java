class method15
{
int a=100;
public static void main(String args[])
{

method15 m=new method15();
int a=m.m1(10);
System.out.println(a);
int b=m.m2();
System.out.println(b);
int c=m.m3(20);
System.out.println(c);
}
//case1:priority goes to loacal variable
int m1(int a)
{
System.out.println("method1");
return a;
}
//case:priority goes to local variable
int m2()
{
System.out.println("meyhod2");
return 20;
}
//prioritity goes to instance variable by this keyword
int m3(int a)
{
System.out.println("method3");
return this.a;
}

}
/*
lib@lib-OptiPlex-3010:~$ javac method15.java
lib@lib-OptiPlex-3010:~$ java method15
method1
10
meyhod2
20
method3
100
*/
