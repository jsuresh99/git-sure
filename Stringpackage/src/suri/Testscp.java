package suri;

public class Testscp {
	public static void main(String[] args) {
		String  s=new String("suri");
		String  s1=new String("suri");
		String s3="suri";
		String s4="suri";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s==s1);//false
		System.out.println(s==s3);//false
		System.out.println(s3==s4);//true
		
		
	}
	

}
