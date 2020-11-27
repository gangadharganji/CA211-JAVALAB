class mythread implements runnable
{
int s,min,hr,d;
{
try
{
for(int i=1;i<=24;i++)
{
min=0;
for(int j=1;j<=60;j++)
{
s=0;
for(int k=1;k<=60;k++)
{
thread.sleep(1000);
s++;
system .out.println(s+"second");
if(s==60)
{
min++;
system .out.println(min+"minutes");
}
}
if(min==60)
{
hr++;
system .out.println(hr+"hours");
}
}
if(hr==24)
{
d++;
system .out.println(d+"days");
}
}
catch(Exception e)
{
e.print stacktrace();
}
}
}
class lab22
{
public static void main(string args[])
{
mythread th=new mythread();
thread t=new thread(th);
t.start();
}
}
