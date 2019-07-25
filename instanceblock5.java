class instance5
{
int eid;
{
eid=111;
}
void disp()
{
System.out.println("eid:"+eid);
}
public static void main(String args[])
{
new instance5().disp();
}
}

//the above statement result show as below....becoz insatce block call during object creation..if no then result 0
/*
lib@lib-OptiPlex-3010:~$ javac instanceblock5.java
lib@lib-OptiPlex-3010:~$ java instance5
eid:111
*/
