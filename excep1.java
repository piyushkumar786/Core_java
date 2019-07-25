//exception handling::abnormal terminate
//1.try
//2.catch
//3.final
//4.throw
//5.throws
//50 keyword in the java
//eg.nasik to pune vechile tyre puncture
//in circus person fall on net is called exception
//program terminated normally
//if five ststement end exception occur at statement 2 then exception occur
//aim is normal termination of the application
//it handle by try catch or throws keyword
//types of exception in java
//1.checked type:the exception checked by compiler 
//2.unchecked:the exception not checked by compiler
class test
{
public static void main(String args[])
{
System.out.println("piyush");
System.out.println("kumar");
System.out.println(10/0);//arithmetic exception
System.out.println("singh");
}
}

/*
//the compiler check then jvm give the msg,so it unchecked exception
piyush@piyush-ESPRIMO-E5730:~$ javac excep1.java
piyush@piyush-ESPRIMO-E5730:~$ java test
piyush
kumar
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at test.main(excep1.java:23)
*/
