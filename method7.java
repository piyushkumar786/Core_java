class method7

{
public static void main(String args[])
{

method7 m=new method7();
m.m1();


}
void m1()
{
System.out.println("method1");
void m2()//inner class method
{
System.out.println("method2");
}
}

}
//java not support ineer method concept but supprot inner method class
/*
lib@lib-OptiPlex-3010:~$ javac method7.java
method7.java:15: error: illegal start of expression
void m2()
^
method7.java:15: error: ';' expected
void m2()
       ^
2 errors
*/
