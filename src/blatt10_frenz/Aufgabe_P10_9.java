package blatt10_frenz;

public class Aufgabe_P10_9 {
	public static void main(String[] args) {
		int[][] data = { { 1, 2, 3, 4, 5, 11, 12, 13 },
				{ 6 },
				{ 7 },
				{ 8, 9, 1, 2, 3, 4, 12, 17, 21, 44 }
				};
		
//		for(int i = 0; i < data.length; i++) {
//			for(int j = 0; j < data[i].length; j++) {
//				if(data[i][j] % 2 == 0) {
//					System.out.print(" " + data[i][j]);
//				}
//			}
//			System.out.println();
//		}
		for(int[] a : data) {
			for(int x : a) {
				if(x % 2 == 0) {
					System.out.print(" " + x);
				}
			}
			System.out.println();
		}
	}

}
