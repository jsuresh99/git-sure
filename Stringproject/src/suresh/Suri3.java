package suresh;
//Reverse String

public class Suri3 {
	public static void main(String[] args) {
		String s="suresh";
		String b="";
		for(int i=s.length()-1;i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		System.out.println(b);
	}

}
