package suri;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] a={ {{10,20,30},{40,50,60}},{{70},{100}}};
		/*for(int[][] b:a) {
			for(int[] c:b) {
				for(int d:c) {
					System.out.println(d);
				}
			}*/
		
			for(int i=0;i<a.length ;i++) {
				for(int j=0;j<a[i].length;j++) {
					for(int z=0; z<a[i][j].length;z++) {
						System.err.println(a[i][j][z]);
					}
				}
				
			}
		}
		}
	//}
		
		


