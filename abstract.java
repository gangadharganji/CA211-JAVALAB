abstract class shape
{
abstract void area();
}
class rectangle extands shape
{
public static void area()
{
int p=2,b=3;
int a=p*b;
system .out.println("area of rectangle"+a);
}
}
class square extends shape
{
public void area
{
int side=2;
int a=side*side;
system .out.println("area of square"+a);
}
}
class lab15
{
public static void main(string args[])
{
rectangle r=new rectangle();
r.area();
square s=new square();
s.area();
}
}
