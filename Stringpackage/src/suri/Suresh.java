package suri;
//if are not overide the tostring metod then object class tostring method will
//be executed if object calss tostring will use that time we will get string represtatio
//hash code if overide the tostring method then will get exact output.
//while using tostring method get the object reference

public class Suresh {
	String name;
	int rollno;
	Suresh(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		
	}
	public String toString() {
		return name+"..."+rollno;
		
	}
	
	public static void main(String[] args) {
		Suresh s=new Suresh("suresh",12);
		Suresh s1=new Suresh("suri",15);
		
		
		System.out.println(s.toString());
		System.out.println(s1.toString());
		
	}
	

}
