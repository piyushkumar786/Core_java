//instance create at object creation
//constructor also craete at object creation
//static at .class file execution
//first instace block execute later constructooer execute
class parent 
{
{
System.out.println("instance block of parent");
}
}
class child extends parent
{
{ System.out.println("child class ins block"); }
public static void main(String args[])
{
new child();

}
}
/*
//instace block execute at the object creation...if two object then two time execute
piyush@piyush-ESPRIMO-E5730:~$ java child
instance block of parent
child class ins block
*/
