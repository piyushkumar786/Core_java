interface it1
{
interface it2
{
void m1();
}
}
class test implements it1.it2//nested interface
{
public void m1() 
{
System.out.println("nested interface");
}
public static void main(String args[])
{
new test().m1();
}
}
/*
//nested interface possible but nested class not possible
piyush@piyush-ESPRIMO-E5730:~$ javac interface5.java
piyush@piyush-ESPRIMO-E5730:~$ java test
nested interface
*/
