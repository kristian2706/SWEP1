package blatt10_frenz;

public class Aufgabe_P10_10 {
	public static void main(String[] args) {
		int[][] data = { { 1, 2, 3, 4, 5, 11, 12, 13 },
				{ 6 },
				{ 7 },
				{ 8, 9, 1, 2, 3, 4, 12, 17, 21, 44 }
				};
		
		int counter = 0;
		int sum = 0;
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				++counter;
				sum += data[i][j];
				}
			}
		
	
		double average = (double)sum/counter;
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(data[i][j] > average) {
					System.out.print(" " + data[i][j]);
				}
			}
			System.out.println();
		}

	
		}
		
	}


