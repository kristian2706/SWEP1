package blatt7;

public class ArrayTabelle {
	public static void main(String[] args) {

		int erg;

		System.out.println(" a | b | c | r \n---+--+--+--");

		for (int a = 0; a <= 1; a++) {
			for (int b = 0; b <= 1; b++) {
				for (int c = 0; c <= 1; c++) {

//					erg = ((a == 1 && b == c) || (a == 0 && (b != c))) ? 1 : 0;

//					erg = (a^b^c);

//					erg = (a + b + c) % 2;

//					erg = (a + b + c) << 31 >>> 31;
					erg = (a + b + c) & 1;

//					if ((a == 1 && b == c) || (a == 0 && (b != c))) {
//						erg = 1;
//					} else {
//						erg = 0;
//					}
					System.out.println(" " + a + " | " + b + " | " + c + " | " + erg);

				}
			}
		}

	}
}
