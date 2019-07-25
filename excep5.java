//finally block:basic exception occur in try block the cacth block not catch then go to finally block
class test
{
public static void main(String args[])
{
try 
{
System.out.println(10/0);
}
catch(Exception e)
{
System.out.println(10/0);
}
finally
{
System.out.println("divide by zero exception");
}
}
}
//the ecceptin occur other than try catch block than abnormal termination
