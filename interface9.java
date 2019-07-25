interface it1
{
	void m1();
	void m2();
	|
	|
	void m10();
}
class x implments  it1//adapter class is nothing but empty class
{
void m1(){}
void m2(){}
|
|
void m10(){}

}
class test implements it1
{
override the 10 method
}
class test extends x
{
override required methods

}

//marker interface:interface have not any method when class implement interface then it capable some oparation
piyush@piyush-ESPRIMO-E5730:~$ javap java.io.Serializable
Compiled from "Serializable.java"
public interface java.io.Serializable {
}
piyush@piyush-ESPRIMO-E5730:~$ javap java.util.RandomAccess
Compiled from "RandomAccess.java"
public interface java.util.RandomAccess {
}

piyush@piyush-ESPRIMO-E5730:~$ javap java.lang.Cloneable
Compiled from "Cloneable.java"
public interface java.lang.Cloneable {
}

