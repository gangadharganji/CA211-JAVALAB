class A
{
Static void display()
{
system .out.println("hai");
}
}
calss B extends A
{
public static void display()
{
system .out.println("hello");
}
}
calss lab14
{
public static viodmain(string args[])
{
A ref;
A a=new A();
B b=new B();
ref=a;
ref.display();
ref=b;
ref.display();
}
}

