//identifier:every name has identifier...int a.(identifier--a)
//rule:identifier conatain..1)a-z..2)A-Z..3)0-9..$ and _(underscore)
//start not with number(int 123)
//special charter not allowed....int abc.123(invlaid)  (.,*/)
//it doesnt not contain keyword..if
//predefied class also identifier....int System
//no length limit of identifier but upto 16 character(recommanded)
//it is case sensitive....Number....number is different
class identifier
{
public static void main(String args[])
{
int String=12;
System.out.println(String);
int num=100;
int Num=105;
System.out.println(num);
System.out.println(Num);
}
}
/*
piyush@piyush-ESPRIMO-E5730:~$ javac identifier.java
piyush@piyush-ESPRIMO-E5730:~$ java identifier
12
100
105
*/

//token:small indidual part of application(tatal 51)
//it contain any space between two token
class pk
{
public
 static 
void
 main(String   args  [])
{
System .
out
.println 
("piyush");
}

}


/*
piyush@piyush-ESPRIMO-E5730:~$ javac identifier.java
piyush@piyush-ESPRIMO-E5730:~$ java pk
piyush
piyush@piyush-ESPRIMO-E5730:~$ 
*/


//comment type--for helping for other
//single line-for single line....//
//multiple line-for more than one line...../*................*/
//document type-for api document(it contain predefinied library)  /*.************.*/


