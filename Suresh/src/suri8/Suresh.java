package suri8;

public class Suresh {
	public void methode() {
		System.out.println("no-arg");
	}
	public void methode(int i) {
		System.out.println("int-arg");
		
	}
	public void  methode(double d) {
		System.out.println("double arg");
	}
	public static void main(String[] args) {
		Suresh s=new Suresh();
		s.methode();
		
		
		s.methode(10);
		s.methode(10.0);
	}

}
