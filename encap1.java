//encapsulation:binding the data
//bind the data tightly by using private modifire
//setter-set the data
//getter -get the data---both in bin class
class beanclass
{
private int eid;//tight binding..use within clas due to private
private String ename;
//setter use set the values
public void setid(int eid)
{
this.eid=eid;
}
public void setEname(String ename)
{
this.ename=ename;
}
//getter-get the value from property
public int getid()
{
return eid;
}
public String getename()
{
return ename;
}
}
