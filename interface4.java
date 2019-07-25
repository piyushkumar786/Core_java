//1.how to implement
interface it1//abstract class
{
void m1();//public abstract method
}
interface it2 extends it1//inheritence between interface using extend keyword
{
void m2();
}
interface it3 extends it2
{
void m3();
}
class test implements it1
{
//this called called m1()
}
class test implements it2
{
//this class called m1(),m2()
}
class test implemants it3
{
//this class implements m1(),m2(),m3()
} 

//2.
interface it1//abstract class
{
void m1();//public abstract method
}
interface it2 extends it1//inheritence between interface using extend keyword
{
void m2();
}
interface it3 extends it2,it1//it can possible access at time two interface
{
void m3();
}
class test implements it3
{
//this called called m1(),m2(),m3()
}




//class extends class
//interface extends interface
//class implements interface

//class a extends b--valid
//class a extends a,b--invalid
//class a implements it1----valid
//class a,b implements it1,it2---valid
//class a extends a---invlaid

//interface it1 extends it2---valid
//interface it1 extends it1,it2---valid
//interface it1 extends a----invalid
//interface it1 extends it1---invalid

//(extend keyword must be first keyword)
//class a extends b implements it1,it2 ----valid
//class a implements it1,it2 extends b---invalid
