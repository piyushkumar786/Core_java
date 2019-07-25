class test
{
public static void main(String args[])
{
String str="piyush";
System.out.println(str.charAt(0));
System.out.println(str.charAt(2));
Thread.sleep(3000);//compile time exception(interrupt exception)
System.out.println(str.charAt(4));

}
}

/*

//it is checked exception...becoz compile time
piyush@piyush-ESPRIMO-E5730:~$ javac excep4.java
excep4.java:8: error: unreported exception InterruptedException; must be caught or declared to be thrown
Thread.sleep(3000);//compile time exception
            ^
1 error
*/
