package blatt10_frenz;

public class IterationVsRekursion {
	public static void main(String[] args) {

		System.out.println(fIterativ(20));
		System.out.println(fRekursiv(20));
		System.out.println(gIterativ(19));
		System.out.println(gRekursiv(19));
	}

	public static int fIterativ(int n) {
		int i = 3;
		int erg = 0;
		for (i = 3; i <= n; i++) {
			erg += (i * i * i) - (i * i) + i;
		}
		return erg;
	}

//	static int i = 3;
//	public static int fRekursiv(int n) {
//		int erg = (i * i * i) - (i * i) + i;
//		if(i < n) {
//			i++;
//			erg += fRekursiv(n);
//			
//		}
//		return erg;
//	}
	public static int fRekursiv(int n) {
		if (n < 3) {
			return 0;
		} else {
			return n * n * n - n * n + n + fRekursiv(n - 1);
		}
	}

	public static double gIterativ(int n) {
		int i = 1;
		double erg = 1;
		for (i = 1; i <= n; i++) {
			erg *= i / (double)(i + 1);
		}
		return erg;
	}

	public static double gRekursiv(double n) {
		if (n < 1) {
			return 1.0;
		} else {
			return (double)n / (double)(n + 1) * gRekursiv(n - 1);
		}
	}


	
	

}
