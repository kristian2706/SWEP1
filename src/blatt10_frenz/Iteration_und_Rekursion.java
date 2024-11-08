package blatt10_frenz;

public class Iteration_und_Rekursion {
	public static void main(String[] args) {
		System.out.println(fibRekursiv(5));
		System.out.println(fibIterativ(5));

	}
	// Fibonacci - Reihe:
	public static int fibRekursiv(int n) {
		if(n <= 1) {
			return n;
		} else {
			return fibRekursiv(n-1) + fibRekursiv(n-2);
		}
		
	}
	public static int fibIterativ(int n) {
		int a = 0;
		int b = 1;
		for(int i = 2; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
		
	}
	
	// Fakultät einer Zahl
	
//	public static int fakRekursiv(int n) {
//		
//	}
//	
	

}
