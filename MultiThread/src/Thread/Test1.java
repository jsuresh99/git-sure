package Thread;

	class Suri extends Thread{
		public void run() {
			System.out.println("suri");
		}
	}
	class Suri2 extends Thread{
		public void run() {
			System.out.println("suri2");
		}
	}
	
	public class Test1 {
		public static void main(String[] args) {
			Suri s=new Suri();
			Suri2 s1=new Suri2();
			s1.setPriority(10);
			s.start();
			s1.start();
			
		}
}
