package Thread;
//write a Thread Programe
 class Suri20 extends Thread {
	public void run() {
		System.out.println("surya");
	}

}
public class TheadPrograme {
	public static void main(String[] args) {
		Suri20 s=new Suri20();
		s.start();
	}
}
