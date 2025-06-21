package suri;

public class Testequa {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("suri");
		StringBuffer s1=new StringBuffer("suri");
		StringBuffer s2=new StringBuffer("suri1");
		StringBuffer s3=s2;
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	}

}
