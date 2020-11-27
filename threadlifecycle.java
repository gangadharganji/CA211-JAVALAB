class lab21 extends thread
{
public viod run()
{
system .out.println("thread is running");
}
public static viod main(string args[])
{
lab21 ob1=new lab21();
lab21 ob2=new lab21();
thread t1=new thread(ob1);
thread t2=new thread(ob2);
system .out.println("t1="+t1.getstate());
system .out.println("t2="+t2.getstate());
t1.start();
system .out.println("t1"=+t1.getstate());
system .out.println("t2="+t2.getstate());
t2.start();
system .out.println("t1="+t1.getstart());
system .out.println("t2="+t2.getstart());
}
}
