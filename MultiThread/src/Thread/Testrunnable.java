package Thread;
//by implemets runnable
class Suri21 implements Runnable{

	@Override
	public void run() {
		System.out.println("surya");
		
	}
	
}
public class Testrunnable {
	public static void main(String[] args) {
		
		Suri21 s=new Suri21();
		Thread t=new Thread(s);
		t.start();
		
		
	}

}
