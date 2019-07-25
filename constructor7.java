//calling constructor
class emp2
{
emp2()
{
this(10);//calling 1 arg constructor
//this(20,30);....it occur problem becoz one constructor call only one constructor...but one function call multiple function
System.out.println("0 arg constructor");
}
emp2(int a)
{
this(20,30); // 2 arg constructor 
System.out.println("1 arg constructor");
}
emp2(int a,int b)
{
System.out.println("2 arg constructor");
}
public static void main(String args[])
{
emp2 e1=new emp2();
}

}
//calling constructor
/*
piyush@piyush-ESPRIMO-E5730:~$ javac constructor7.java
piyush@piyush-ESPRIMO-E5730:~$ java emp2
2 arg constructor
1 arg constructor
0 arg constructor
*/
