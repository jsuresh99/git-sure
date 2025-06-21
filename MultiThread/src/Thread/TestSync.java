package Thread;
class Suri24{
	
	public synchronized void cricket(String name) throws InterruptedException {
		
		System.out.println(name);
		Thread.sleep(30000);
		
	}
	
}
class Suri25 extends Thread{
	Suri24 s;
	String name;
	Suri25(Suri24 s,String name){
		this.s=s;
		this.name=name;
		
		
	}
	public void run() {
		try {
			s.cricket(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class TestSync {
	public static void main(String[] args) {
		Suri24 s2=new Suri24();
		Suri25 s3=new Suri25(s2,"Dhoni");
		Suri25 s4=new Suri25(s2,"kohli");
		
		s3.start();
		s4.start();
		
		
	}

}
