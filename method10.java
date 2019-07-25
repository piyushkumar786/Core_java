class method10
{
int x=100;
int y=200;//instace variable
public static void main(String args[])
{
method10 m=new method10();
m.add(1000,2000);
}
 static void add(int x,int y)//instace method and local variable
{
System.out.println(x+y);
System.out.println(this.x+this.y);
}
}
//if function is static then this keyword are not use in whole java,it use only instace function
/*
lib@lib-OptiPlex-3010:~$ javac method10.java
method10.java:13: error: non-static variable this cannot be referenced from a static context
System.out.println(this.x+this.y);
                   ^
method10.java:13: error: non-static variable this cannot be referenced from a static context
System.out.println(this.x+this.y);
                          ^
2 errors
*/
