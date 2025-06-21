package suri;

public class Test {

int[] i=new int[] {10,20,30};
	public  int mulu() {
		int total=1;
		for(int x1:i) {
			total=total*x1;	
		}
		return total;	
	}
public  int sum() {	
		int total=1;
		for(int x1:i) {
			total=total+x1;		
		}
		return total;
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.mulu();
		t.sum();
		System.out.println(t.mulu());
	
	}}
