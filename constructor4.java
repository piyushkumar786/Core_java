class emp
{
//instance variable
int eid;//0
String ename;//null
float esal;//0.0
emp()//user definied constructot during object creation
{
eid=111;
ename="piyush";
esal=1000.25f;
}
void disp()
{
System.out.println("emp id="+eid);
System.out.println("emp name="+ename);
System.out.println("emp salary:="+esal);
}
public static void main(String args[])
{
emp e=new emp();//defalut constructor
e.disp();
}
}
//it print deafult value so assign new value
/*
piyush@piyush-ESPRIMO-E5730:~$ javac constructor4.java
piyush@piyush-ESPRIMO-E5730:~$ java emp
emp id=111
emp name=piyush
emp salary:=1000.25
*/
