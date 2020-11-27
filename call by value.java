import java.util.scanner;
import java.io.*;
class callbyvalue
{
void read(intx,inty)
{
x=x+10;
y=y+10;
}
}
class lab12a
{
public static void main(string args[])
{
int x,y;
scanner s=new scanner(system.in);
x=s.nextint();
y=s.nextint();
system .out.println("before the xandy values are"+x","y);
call byvalue c=new callbyvalue();
c.read(x,y);
system .out.println("after the x and y values are"+x+","+y);
}
}
