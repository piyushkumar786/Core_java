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
emp e1=new emp();//defalut constructor
e1.disp();
}
}
//for every object same default constructor occur..so overcome use parameerter constructor
/*
piyush@piyush-ESPRIMO-E5730:~$ java emp
emp id=111
emp name=piyush
emp salary:=1000.25
emp id=111
emp name=piyush
emp salary:=1000.25
*/
