//object creation
//1.with named
//2.without named
class emp2
{
emp2()
{

System.out.println("0 arg constructor");
}
emp2(int a)
{

System.out.println("1 arg constructor");
}
emp2(int a,int b)
{
System.out.println("2 arg constructor");
}
public static void main(String args[])
{
//with named
emp2 e1=new emp2();
emp2 e2=new emp2(10);
emp2 e3=new emp2(20,30);
//without named
new emp2();
new emp2(40);
new emp2(50,60);
}

}
/*
piyush@piyush-ESPRIMO-E5730:~$ javac constructor8.java
piyush@piyush-ESPRIMO-E5730:~$ java emp2
0 arg constructor
1 arg constructor
2 arg constructor
0 arg constructor
1 arg constructor
2 arg constructor
*/
