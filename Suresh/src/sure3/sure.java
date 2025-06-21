package sure3;

public class sure implements Suresh,Suresh1 {

	@Override
	public void methode() {
		System.out.println("hai");
		
	}
	@Override
	public void methode1() {
		System.out.println("bye");
		
	}
	public static void main(String[] args) {
		sure s=new sure();
		s.methode();
		s.methode1();
	}
	

}
