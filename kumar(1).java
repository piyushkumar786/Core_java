import java.lang.System;//System class................total 14 package
import java.lang.String;//String class................default package in java (java.lang).....it is automatically imoported
class piyush   //program name save with public class name
{                   //source class contain only one public class.if more then error occur
public static void main(String args[])  //file save with any name,when complied create all class byte file.jvm check byte
                                        //file if present then load into memory ,if no error then generate byte code,then byte code
{                                       //exit it execute this byte code,but only main method byte code execute.piyush.class,A.class,B.class
System.out.println("piyush");  //why lang package default becoz not every time write System and String
                                 //source code containg also multiple main method
}                                //compiler complie the code
                                 //jvm execute class file
                                //c->denish richtee----header->method(os call main method)
                                //c++->stropus bezonstrp-------header->method(os call main method)
}                              //java->package->class,inherit--->method (jvm call main method)
                              //ide done 75%work like save,compile,aaaautomatic code generetion,compile
class A{
public static void main(String args[])
{
System.out.println("kumar");
}
}
class B{
public static void main(String args[])
{
System.out.println("singh");
}
}



/*
piyush@piyush-ESPRIMO-E5730:~$ javac kumar.java
piyush@piyush-ESPRIMO-E5730:~$ java piyush
piyush
piyush@piyush-ESPRIMO-E5730:~$ javac kumar.java
piyush@piyush-ESPRIMO-E5730:~$ java kumar
Error: Could not find or load main class kumar
piyush@piyush-ESPRIMO-E5730:~$ java piyush
piyush
piyush@piyush-ESPRIMO-E5730:~$ java A
kumar
piyush@piyush-ESPRIMO-E5730:~$ java B
singh
piyush@piyush-ESPRIMO-E5730:~$ 
*/

