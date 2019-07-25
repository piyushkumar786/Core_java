class test
{
interface it1
{
void m1();
}
}
class test2 implements test.it1//nested interface
{
public void m1()
{
System.out.println("nested interface in class");
}
public static void main(String args[])
{
new test2().m1();
}
}

/*
//nested interface possible using class
piyush@piyush-ESPRIMO-E5730:~$ javac interface6.java
piyush@piyush-ESPRIMO-E5730:~$ java test2
nested interface in class
*/
