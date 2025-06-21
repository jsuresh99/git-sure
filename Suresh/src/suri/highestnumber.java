package suri;

public class highestnumber {
int x=10;
static int y=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		highestnumber h=new highestnumber();
		
		System.out.println(h.x);
	
		h.methodOne();
		System.out.println(y);
		System.out.println(highestnumber.y);
	}
public void methodOne() {
	System.out.println(x);
}	
}
