//interface:
//abstarct class contain or may not contain abstrct method
//interface declare interface keyword
//interface declare only abstrct method
//we can not direct implement functionality so we can only declare functinality
//interface by default abstarct and method is abstract and class abstrct
//it also knows as srs documnet
//not require object creation

interface teacher//by default abstract class
{
void m1();//by default public abstrct method
void m2();
void m3();
}

class student implements teacher
{
void m1()
{
System.out.println("m1 method");
}
void m2()
{
System.out.println("m2 method");
}
void m3()
{
System.out.println("m3 method");
}
public static void main(String args[])
{
new student().m1();
new student().m2();
new student().m3();
}
}
/*
//this error occur becoz less permission 
becoz implements method is public but class method by defult is default...this error corrected nect program
piyush@piyush-ESPRIMO-E5730:~$ javac interface1.java
interface1.java:27: error: m3() in student cannot implement m3() in teacher
void m3()
     ^
  attempting to assign weaker access privileges; was public
interface1.java:23: error: m2() in student cannot implement m2() in teacher
void m2()
     ^
  attempting to assign weaker access privileges; was public
interface1.java:19: error: m1() in student cannot implement m1() in teacher
void m1()
     ^
  attempting to assign weaker access privileges; was public
3 errors
*/
