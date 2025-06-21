package suri;

public class duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,10};
		
		int b=a.length;
		System.out.println(b);
		for(int i=0;i<b;i++) {
			for(int j=i+1;j<b;j++) {
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}
		

	}

}
