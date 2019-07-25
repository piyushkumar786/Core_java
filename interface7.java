interface it1
{
int a=10;//public static final
void m1();
}
class test implements it1
{
public void m1()
{
a=a+10;
System.out.println(a);
}
public static void main(String args[])
{
new test().m1();
}
}
/*
//it not possible becoz variable act as public static final...i.e not modifiaction
piyush@piyush-ESPRIMO-E5730:~$ javac interface7.java
interface7.java:10: error: cannot assign a value to final variable a
a=a+10;
^
1 error
*/
