class test
{
public static void main(String args[])
{
String str="piyush";
System.out.println(str.charAt(0));
System.out.println(str.charAt(2));
System.out.println(str.charAt(4));
System.out.println(str.charAt(20));//String bound exception
}
}
/*
//String bound exception..unchecked exception
piyush@piyush-ESPRIMO-E5730:~$ javac excep3.java
piyush@piyush-ESPRIMO-E5730:~$ java test
p
y
s
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 20
	at java.lang.String.charAt(String.java:658)
	at test.main(excep3.java:9)
-*/
