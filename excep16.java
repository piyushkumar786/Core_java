//throw:deligating exception
class test
{
void shubham() throws InterruptedException
{

System.out.println("delay time");
Thread.sleep(3000);//3-sec


System.out.println("sleep mode");


}
void ganesh() throws InterruptedException
{
shubham();//first time exception
}
void gopal() throws InterruptedException
{
ganesh();//second time exception
}
void piyush() throws InterruptedException
{
gopal();//third time exception
}
public static void main(String args[]) throws InterruptedException
{
new test().piyush();//fourth time exception
}
}
/*
case 1:when no try catch or throw use
piyush@piyush-ESPRIMO-E5730:~$ javac excep16.java
excep16.java:7: error: unreported exception InterruptedException; must be caught or declared to be thrown
Thread.sleep(3000);//3-sec
            ^
1 error
*/

/*
case2:use try catch block handle the exception
void shubham()
{
try
{
System.out.println("delay time");
Thread.sleep(3000);//3-sec
}
catch(Exception e)
{
System.out.println("sleep mode");
e.printStackTrace();
}
}
*/

/*
case3-use throw keyword then exception goes to caller function...i.e passes exception to caller function

void shubham() throws InterruptedException

piyush@piyush-ESPRIMO-E5730:~$ javac excep16.java
excep16.java:17: error: unreported exception InterruptedException; must be caught or declared to be thrown
shubham();
       ^
1 error
*/


/*
//all caller function use  throws keyword handle exception....main method exception handle by jvm
....throws use at method declartion
piyush@piyush-ESPRIMO-E5730:~$ javac excep16.java
piyush@piyush-ESPRIMO-E5730:~$ java test
delay time
sleep mode
*/
