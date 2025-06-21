package suri10;

public class Suresh {
	String name;
	int rollno;
	
Suresh(String name,int rollno){
	
	this.name=name;
	this.rollno=rollno;
}
public static void main(String[] args) {
	Suresh s1=new Suresh("akhi",1);
	Suresh s2=new Suresh("akhila",20);
	Suresh s3=new Suresh("suresh",40);
	System.out.println("name:"+s1.name );
	System.out.println("roolno:"+s1.rollno );
	System.out.println("name:"+s2.name );
	System.out.println("roolno:"+s2.rollno );
	System.out.println("name:"+s3.name );
	System.out.println("roolno:"+s3.name );
	
}
}
