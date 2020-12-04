import java.util.Scanner;
class Lab6
{
int Sno;
String Sname;
Lab6()
{
Sno=1;
Sname="rama";
}
Lab6(int sno,String sname)
{
this.Sno=sno;
this.Sname=sname;
}
void display()
{
System.out.println(Sno+Sname);
}
public static void main(String args[])
{
Lab6 s=new Lab6();
s.display();
Lab6 S1=new Lab6(3,"sita");
S1.display();
Scanner ob=new Scanner(System.in);
int sno2=ob.nextInt();
String Sname2=ob.next();
Lab6 S3=new Lab6(sno2,Sname2);
S3.display();
}
}
