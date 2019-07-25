class emp1
{
//instance variable
int eid;//0
String ename;//null
float esal;//0.0
emp1(int eid,String ename,float esal)//parameter constructor.....local variable
{
this.eid=eid;//conversion of local value to instance value
this.ename=ename;
this.esal=esal;
}
void disp()
{
System.out.println("emp id="+eid);
System.out.println("emp name="+ename);
System.out.println("emp salary:="+esal);
}
public static void main(String args[])
{
//emp e=new emp();//defalut constructor
//e.disp();
emp1 e1=new emp1(12,"piyush",20000.25f);//parameter constructor
e1.disp();
emp1 e2=new emp1(13,"kumar",120000.25f);//parameter constructor
e2.disp();
}
}
/*
piyush@piyush-ESPRIMO-E5730:~$ javac constructor6.java
piyush@piyush-ESPRIMO-E5730:~$ java emp1
emp id=12
emp name=piyush
emp salary:=20000.25
emp id=13
emp name=kumar
emp salary:=120000.25
*/
