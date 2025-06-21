package Thread;
//Interrupt Thread
// A thread can Interrupt another thread
//if a thread can Interupt a sleepin Thread and Waiting Threadby using Interupt
class Suri22 extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("surya");
	}
}
class Suri23 extends Thread{
	public void run() {
		System.out.println("surya1");
	}
}
public class TestInterrupt  {
	public static void main(String[] args) {
		Suri22 s=new Suri22();
		Suri23 s1=new Suri23();
		s.interrupt();
		s.start();
		s1.start();
	
		
	}

}
