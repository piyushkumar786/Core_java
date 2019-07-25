//variable vs default value
//byte(0)
//short(0)
//int(0)
//long(0)
//float(0.0)
//double(0.0)
//char(single space)
//boolean(false)
//this default value provide by jvm
//oject default value is null
class defaultval
{

static int a;
static boolean b;
 public static void main(String args[])
{
defaultval d=new defaultval();
System.out.println(d.a);
System.out.println(d.b);
}
}

/*
piyush@piyush-ESPRIMO-E5730:~$ javac defaultval.java
piyush@piyush-ESPRIMO-E5730:~$ java defaultval
0
false
*/
