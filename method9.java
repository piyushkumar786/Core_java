class method9
{
int x=100;
int y=200;//instace variable
public static void main(String args[])
{
method9 m=new method9();
m.add(1000,2000);
}
void add(int x,int y)//instace method and local variable
{
System.out.println(x+y);
System.out.println(this.x+this.y);
}
}
//if we take same value name as local and instace
//then first priority go to the local variable
//so output is same 
/*
lib@lib-OptiPlex-3010:~$ javac method9.java
lib@lib-OptiPlex-3010:~$ java method9
3000
3000
*/
//if we use this keyword method the it give the priority to instance variable when same name of the variable
/*
lib@lib-OptiPlex-3010:~$ javac method9.java
lib@lib-OptiPlex-3010:~$ java method9
3000
300
*/
