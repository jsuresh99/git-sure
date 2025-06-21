package suri;

public class Suristring {
	String name;
	Suristring(String name){
		this.name=name;
	}
	public String toString() {
		return name;
		
	}
	public static void main(String[] args) {
		String s=new String("sueresh");
		String s1=new String("suri");
		System.out.println(s);
		System.out.println(s1);
		Suristring s2=new Suristring("surya");
		Suristring s3=new Suristring("surya1");
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
	}

}
