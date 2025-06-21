package Thread;
//if thread wants wait until completing the other thread execution

class Test3 extends Thread{
	public void run()  {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("sur1");
	}}
class Test4 extends Thread{
	public void run() {
		System.out.println("syri2");
	}
}
public class TestJoin {
	public static void main(String[] args) throws InterruptedException {
		Test3 t=new Test3();
	
		t.join();
		Test4 t1=new Test4();
		
		t.start();
		t1.start();
		
	
	}

}

