class emp
{
//instance variable
int eid;//0
String ename;//null
float esal;//0.0
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
//obj create defaut value generate
/*
piyush@piyush-ESPRIMO-E5730:~$ java emp
emp id=0
emp name=null
emp salary:=0.0
*/
