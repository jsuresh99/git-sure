package suri;

public class Surihash {
	int i;
	Surihash(int i){
		this.i=i;
	}
	public int hashCode() {
		return i;
		
	}
	public String toString() {
		return i+"";
		
	}
	
	
	public static void main(String[] args) {
		Surihash s=new Surihash(10);
		Surihash s1=new Surihash(20);
		System.out.println(s);
		System.out.println(s1.hashCode());
		
	}

}
