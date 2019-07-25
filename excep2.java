class test
{
public static void main(String args[])
{
int a[]={10,20,30,40};
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[3]);
System.out.println(a[10]);//array index bound exception
}
}
/*
//unchecked exception
piyush@piyush-ESPRIMO-E5730:~$ javac excep2.java
piyush@piyush-ESPRIMO-E5730:~$ java test
10
20
40
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at test.main(excep2.java:9)
*/
