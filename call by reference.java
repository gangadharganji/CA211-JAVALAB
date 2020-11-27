import java.util.scanner;
import java.io.*;
calss cbr
{
int a,b;
void read(cbr c)
{
c.a=c.a+10;
c.b=c.b+10;
}
}
class lab12b
{
public static void main(string args[])
{
cbr c=new cbr();
scanner s=new scanner(system.in);
c.a=s.nextint();
c.b=s.nextint();
system .out.println("before the a and b values are"+c.a+","+c.b);
c.read(c);
system .out.println("after the a and b values are"+c.a+","+c.b);
}
}
