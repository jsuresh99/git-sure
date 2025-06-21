package suri;

public class Testsub implements Cloneable{
	int i=10;
	int j=20;
public static void main(String[] args) throws CloneNotSupportedException {
	Testsub t=new Testsub();
	Testsub t1=(Testsub)t.clone();
	t1.i=100;
	t1.j=300;
System.out.println(t.i+"...."+t.j);
System.out.println(t1.i+"...."+t1.j);
}
}

