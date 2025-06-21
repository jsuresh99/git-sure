package Thread;
//to pass current Thread execution for giving the chance for remaining waiting
//same priority threads calles as yield()
class Suresh extends Thread{
	public void run() {
		System.out.println("suri");
	}
}
class Suresh1 extends Thread{
	
	public void run() {
		
		System.out.println("suri1");
		Thread.yield();
	}
}
class Suresh2 extends Thread{
	public void run() {
		System.out.println("suri2");
	}
}

public class Testyield {
	public static void main(String[] args) {
		Suresh s=new Suresh();
		Suresh1 s1=new Suresh1();
		Suresh2 s2=new Suresh2();
	 	s.start();
		s1.start();
		s2.start();
	}
	
	

}
