package Thread;
//if a thread want don't perform anything some amount of time
class Test9 extends Thread{
	public void run() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("surya");
	}
}
class Test10 extends Thread{
	public void run() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("surya1");
	}
}
class Test11 extends Thread{
	public void run() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("surya2");
	}
}
public class Testsleep {
	public static void main(String[] args) {
		
	
	Test9 t=new Test9();
	Test10 t1=new Test10();
	Test11 t2=new Test11();
	t.start();
	t1.start();
	t2.start();
	}	

}
