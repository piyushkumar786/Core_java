interface it1
{
int a=10;
void m1();
}
interface it2
{
int a=100;
void m1();
}
class test implements it1,it2
{
public void m1()
{
//System.out.println(a);//error:due to method ovrridding
System.out.println(it1.a);//calling by interface name
System.out.println(it2.a);
}
public static void main(String args[])
{
new test().m1();
}
}
/*
//it is possible calling by its interface name,here not work as final thats way it is the modifible
piyush@piyush-ESPRIMO-E5730:~$ javac interface8.java
piyush@piyush-ESPRIMO-E5730:~$ java test
10
100
*/
