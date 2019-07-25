class InvalidAgeException extends Exception
{
InvalidAgeException(String str)
{
super(str);
}
}

/*

//it is paremter user definied checked exception
piyush@piyush-ESPRIMO-E5730:~$ javac InvalidAgeException1.java
piyush@piyush-ESPRIMO-E5730:~$ javac excep19.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
19
eligible for mrg
piyush@piyush-ESPRIMO-E5730:~$ javac excep19.java
piyush@piyush-ESPRIMO-E5730:~$ java test
enter your age
15
Exception in thread "main" InvalidAgeException: not eligible/ by zero
	at test.status(excep19.java:12)
	at test.main(excep19.java:21)
*/
