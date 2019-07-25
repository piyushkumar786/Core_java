//flow statement
//1.conditional st(condition)(if,else,switch)
//2.iteration statement(loop)(while,for,do while)
//3.transfer statement(transfer one to other block)(try,return,goto,break,continue)
//if(boolean condition){true body}else{false body}
//curely brace is optional.but declare only one statement
//0=false...1=true  it is valid for c++ and c not java
//
class flowstatement
{
public static void main(String args[])

{
//if ....else
int a=10;
if(true)
{
System.out.println("true body");
}
else
{
System.out.println("false body");
}




//switch satatement-it check arg with case,it is not match then defalut occur
//argument like int,byte,char,short,string,enum...(float,double,long not allowed it more range)
int b=10;
//possible for operation also
//not possile for two same case
//piyush@piyush-ESPRIMO-E5730:~$ javac flowstatement.java
//flowstatement.java:36: error: duplicate case label
//case 5*2:
//defalut is optonal it is nomandotory write 

switch(b)
{
case 'p':
System.out.println("piyush");
break;
case 10*1:
System.out.println("kumar");
break;
case 5*3:
System.out.println("singh");
break;
default:
System.out.println("default");
break;
}

//for loop
//1.basic loop
for(int i=0;i<10;i++)
{
System.out.println(i+"\n");
}
//2.intialization is option
int i=0;
for(;i<10;i++)
{
System.out.println(i);
}
//3.intialization with sop
i=0;
for(System.out.println("intialiazation");i<10;i++)
{
System.out.println("kumar");
}
//4.for loop with Sop
i=0;
for(System.out.println("piyush"),System.out.println("kumar");i<10;i++)
{
System.out.println("singh");
}
//5.it not possible intailize two datatype at time.but possible two varible of same datatype
for(int j=0,k=10;j<10;j++)
{
System.out.println(k);
}
//6.condition is option.if dont write contion i take by default true value
/*for(int j=0;;j++)//contidion by default true
{
System.out.println("true value by defalut");
}*/
//7.increment and decrement part is optional
/*for(i=0;i<10;)
{
System.out.println("increamet and decrement is optional");
}*/
//8.increment and decerement with sop
/*
for(i=0;i<10;System.out.println("increment decrement with sop"))
{
System.out.println("sop");
}*/
//9.increment decrement with multiple sop
/*for(i=0;i<10;System.out.println("piyush"),System.out.println("kumar"))
{
System.out.println("singh");
}*/
//10.infinite loop
/*for( ; ; )
{
System.out.println("infinite loop");
} */
//11.unrechable error with boolean true
/*for(i=0;true;i++)
{
System.out.println("true");
}///infinite loop */
//12.outside body that is unreachable
/*for(i=0;false;i++)
{
System.out.println("not enter the into for loop body");
}//unreachable statement */
//13.not unreachable
/*for(i=0;i<10;)
{
System.out.println("hii");
}*/




//WHILE LOOP while(boolean true,false)
//while use for check and retrieve,.......while(hasnext()).....not require intialize and inc and dec
//arraydata use forloop
//cheak and retrive use while loop
//while loop must pass condition
//1.basic
 i=0;
while(i<10)
{
System.out.println("hii piyush");
i++;
}
//2.unreachable loop
/*i=0;
while(true)
{
System.out.println("hii unreachable");
i++;
}*/
//3.body unreachable...flowstatement.java:145: error: unreachable statement
/*i=0;
while(false)
{
System.out.println("body unreachable");
i++;
}*/


//DO WHILE LOOP....execute body then check condition...atm machine.....do{}while(boolean);

i=0;
do
{
System.out.println("do while");
i++;
}while(i<10);//print 10 time  
/*  unreachable statement
i=0;
do
{
System.out.println("infite loop");
i++;
}while(true);  */
//3.in do while loop it reah the body becoz first enter body then it check it.but in for and while loop it is unreachable
i=0;
do
{
System.out.println("at this time reach the body");
i++;
}while(false);


//transfer statement:conrol transfer one two another statement
//goto statement not use in java(it cause more distrubution)
//break :break the statement(stop execution)
//continue:continue the statement
//try:statenment transfer to the catch block
//return:return the value
for(i=0;i<10;i++)
{
if(i==5)
{
break;//(come out loop..come out from for loop)...break use only two area ie.switch.,inside loop(while,for,do while)..output-0,1.2,3
}
else
{
System.out.println(i);
}
}
//2.
/*if(true)
{
System.out.println("piyush");
System.out.println("kumar");
break;
System.out.println("singh");//error msg show becoz it use only for,while,do while...flowstatement.java:198: error: break outside switch or loop

}*/

//CONTINUE:stop the particular execution
for(i=0;i<10;i++)
{
if(i==5)
{
continue;//it opposte of the break .ie print when condtion true skip the part print next value...output-0,1,2,3,4,6,7,8,9
}
else
{
System.out.println(i);
}
}
//2.it shows error outside the loop mean use for loop
/*if(true)
{
System.out.println("piyush");
System.out.println("kumar");
continue;
System.out.println("singh");

}*/
}
}
