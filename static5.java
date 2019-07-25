class staticblock3
{
static int eid;//default value 0..static variable
static 
{
eid=234;//default value change to 234
}
static void disp()//static function
{
System.out.println(staticblock3.eid);//static variable call by class name
}
public static void main(String args[])
{
staticblock3.disp();//static ...so calling by classname
}
}
/*
lib@lib-OptiPlex-3010:~$ javac static5.java
lib@lib-OptiPlex-3010:~$ java staticblock3
234
*/
